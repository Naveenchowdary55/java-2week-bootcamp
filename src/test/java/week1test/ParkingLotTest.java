package week1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ParkingLotTest {

    @Test
    void defaultConstructorGivesTenSpaces() {
        ParkingLot lot = new ParkingLot();
        assertEquals(10, lot.capacity(),
                "the no-argument constructor must build a lot of capacity 10");
        assertEquals(0, lot.occupied(),
                "a new lot starts empty");
        assertEquals(10, lot.availableSpaces(),
                "a new lot of capacity 10 has 10 free spaces");
    }

    @Test
    void capacityConstructorIsRespected() {
        ParkingLot lot = new ParkingLot(3);
        assertEquals(3, lot.capacity(),
                "capacity() must return the capacity passed to the constructor");
        assertEquals(3, lot.availableSpaces(),
                "an empty lot of capacity 3 has 3 free spaces");
    }

    @Test
    void rejectsAnImpossibleCapacity() {
        assertThrows(IllegalArgumentException.class,
                () -> new ParkingLot(0),
                "a lot with 0 spaces makes no sense — throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> new ParkingLot(-5),
                "a negative capacity must throw IllegalArgumentException");
    }

    @Test
    void parkingACarFillsASpace() {
        ParkingLot lot = new ParkingLot(2);
        assertTrue(lot.park("KA01AB1234"),
                "parking into an empty lot must succeed and return true");
        assertTrue(lot.isParked("KA01AB1234"),
                "the car we just parked must report as parked");
        assertEquals(1, lot.occupied(),
                "one car parked means occupied() is 1");
        assertEquals(1, lot.availableSpaces(),
                "one car in a 2-space lot leaves 1 free");
    }

    @Test
    void platesAreMatchedIgnoringCase() {
        ParkingLot lot = new ParkingLot(2);
        lot.park("KA01AB1234");
        assertTrue(lot.isParked("ka01ab1234"),
                "plates must match ignoring case — same car, different typing");
        assertFalse(lot.park("ka01ab1234"),
                "the same car cannot be parked twice, whatever the case");
        assertEquals(1, lot.occupied(),
                "the rejected duplicate must not have taken a second space");
    }

    @Test
    void aFullLotTurnsCarsAway() {
        ParkingLot lot = new ParkingLot(2);
        assertTrue(lot.park("AAA"), "first car fits");
        assertTrue(lot.park("BBB"), "second car fits");
        assertFalse(lot.park("CCC"),
                "a full lot must return false, not throw and not overflow");
        assertEquals(2, lot.occupied(),
                "the turned-away car must not be counted");
        assertEquals(0, lot.availableSpaces(),
                "a full lot has 0 free spaces");
        assertFalse(lot.isParked("CCC"),
                "the car that was turned away is not in the lot");
    }

    @Test
    void leavingFreesTheSpaceForSomeoneElse() {
        ParkingLot lot = new ParkingLot(1);
        lot.park("AAA");
        assertTrue(lot.leave("aaa"),
                "leaving must match the plate ignoring case and return true");
        assertFalse(lot.isParked("AAA"),
                "the car has left, so it is no longer parked");
        assertEquals(0, lot.occupied(),
                "after the only car leaves the lot is empty");
        assertTrue(lot.park("BBB"),
                "the freed space must be reusable by a different car");
    }

    @Test
    void leavingACarThatIsNotThereFails() {
        ParkingLot lot = new ParkingLot(2);
        lot.park("AAA");
        assertFalse(lot.leave("ZZZ"),
                "a car that was never parked cannot leave — return false, do not throw");
        assertEquals(1, lot.occupied(),
                "the failed leave must not have removed anybody");
    }

    @Test
    void rejectsNullAndBlankPlates() {
        ParkingLot lot = new ParkingLot(2);
        assertThrows(IllegalArgumentException.class, () -> lot.park(null),
                "park(null) must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> lot.park("   "),
                "a blank plate must throw IllegalArgumentException, not park a ghost car");
        assertThrows(IllegalArgumentException.class, () -> lot.leave(null),
                "leave(null) must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> lot.isParked(""),
                "isParked(\"\") must throw IllegalArgumentException");
    }

    @Test
    void twoLotsDoNotShareState() {
        ParkingLot first = new ParkingLot(2);
        ParkingLot second = new ParkingLot(2);
        first.park("AAA");
        assertFalse(second.isParked("AAA"),
                "parking in one lot must not affect the other — no static fields!");
        assertEquals(0, second.occupied(),
                "the second lot must still be empty");
        assertEquals(1, first.occupied(),
                "the first lot keeps its own car");
    }
}
