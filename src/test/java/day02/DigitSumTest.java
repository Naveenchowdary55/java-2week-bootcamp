package day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DigitSumTest {

    @Test
    void sumsTheFourDigits() {
        assertEquals(10, DigitSum.sumOfDigits4(1234),
                "sumOfDigits4(1234) = 1 + 2 + 3 + 4 = 10");
    }

    @Test
    void handlesAllNines() {
        assertEquals(36, DigitSum.sumOfDigits4(9999),
                "sumOfDigits4(9999) = 9 + 9 + 9 + 9 = 36");
    }

    @Test
    void handlesZerosInTheMiddle() {
        assertEquals(1, DigitSum.sumOfDigits4(1000),
                "sumOfDigits4(1000) = 1 + 0 + 0 + 0 = 1");
    }

    @Test
    void handlesMixedDigits() {
        assertEquals(20, DigitSum.sumOfDigits4(5807),
                "sumOfDigits4(5807) = 5 + 8 + 0 + 7 = 20");
    }
}
