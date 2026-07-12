package day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ElectricityBillTest {

    @Test
    void firstSlabOnly() {
        assertEquals(150.0, ElectricityBill.amount(50), 1e-9,
                "50 units * 3 = 150.0");
    }

    @Test
    void spillsIntoSecondSlab() {
        assertEquals(550.0, ElectricityBill.amount(150), 1e-9,
                "100*3 + 50*5 = 300 + 250 = 550.0");
    }

    @Test
    void spillsIntoThirdSlab() {
        assertEquals(1200.0, ElectricityBill.amount(250), 1e-9,
                "100*3 + 100*5 + 50*8 = 300 + 500 + 400 = 1200.0");
    }

    @Test
    void spillsIntoTopSlab() {
        assertEquals(4200.0, ElectricityBill.amount(600), 1e-9,
                "100*3 + 100*5 + 300*8 + 100*10 = 300 + 500 + 2400 + 1000 = 4200.0");
    }

    @Test
    void negativeUnitsThrow() {
        assertThrows(IllegalArgumentException.class, () -> ElectricityBill.amount(-1),
                "negative units must throw IllegalArgumentException");
    }
}
