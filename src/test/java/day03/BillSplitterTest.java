package day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BillSplitterTest {

    @Test
    void addsTipWhenTotalIsOverTwoThousand() {
        assertEquals(1100.0, BillSplitter.perPersonShare(3000, 3), 1e-9,
                "3000 > 2000 so add 10% tip -> 3300, then / 3 = 1100.0");
    }

    @Test
    void noTipAtExactlyTwoThousand() {
        assertEquals(500.0, BillSplitter.perPersonShare(2000, 4), 1e-9,
                "2000 is not strictly greater than 2000, so no tip; 2000 / 4 = 500.0");
    }

    @Test
    void noTipBelowThreshold() {
        assertEquals(500.0, BillSplitter.perPersonShare(1000, 2), 1e-9,
                "1000 / 2 = 500.0 with no tip");
    }

    @Test
    void zeroOrNegativePeopleThrow() {
        assertThrows(IllegalArgumentException.class, () -> BillSplitter.perPersonShare(1000, 0),
                "0 people must throw IllegalArgumentException");
    }

    @Test
    void negativeTotalThrows() {
        assertThrows(IllegalArgumentException.class, () -> BillSplitter.perPersonShare(-1, 3),
                "a negative total must throw IllegalArgumentException");
    }
}
