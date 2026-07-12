package day03;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    void ordinaryLeapYear() {
        assertTrue(LeapYear.isLeap(2024), "2024 is divisible by 4 and not a century -> leap");
    }

    @Test
    void ordinaryNonLeapYear() {
        assertFalse(LeapYear.isLeap(2023), "2023 is not divisible by 4 -> not leap");
    }

    @Test
    void centuryNotDivisibleBy400IsNotLeap() {
        assertFalse(LeapYear.isLeap(1900), "1900 is a century not divisible by 400 -> not leap");
    }

    @Test
    void centuryDivisibleBy400IsLeap() {
        assertTrue(LeapYear.isLeap(2000), "2000 is a century divisible by 400 -> leap");
    }
}
