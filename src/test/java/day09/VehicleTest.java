package day09;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void carDescribesItselfThroughVehicleReference() {
        Vehicle v = new Car();
        assertEquals("I am a car", v.describe(),
                "Even though v is typed as Vehicle, dynamic dispatch runs the Car version of describe()");
    }

    @Test
    void bikeAndTruckOverrideToo() {
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        assertEquals("I am a bike", bike.describe(), "Bike should override describe() to say it is a bike");
        assertEquals("I am a truck", truck.describe(), "Truck should override describe() to say it is a truck");
    }

    @Test
    void baseVehicleStillReturnsGenericText() {
        Vehicle v = new Vehicle();
        assertEquals("I am a generic vehicle", v.describe(),
                "A plain Vehicle should still return the base description");
        assertNotEquals(v.describe(), new Car().describe(),
                "Overriding REPLACES the inherited behavior — a Car must not sound like a generic vehicle");
    }

    @Test
    void garageDescribesAMixedArray() {
        Vehicle[] vehicles = {new Car(), new Bike(), new Truck()};
        String[] expected = {"I am a car", "I am a bike", "I am a truck"};
        assertArrayEquals(expected, Garage.describeAll(vehicles),
                "describeAll should call describe() on each vehicle, preserving order");
    }
}
