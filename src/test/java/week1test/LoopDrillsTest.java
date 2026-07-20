package week1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class LoopDrillsTest {

    @Test
    void digitSumAddsEveryDigit() {
        assertEquals(10, LoopDrills.digitSum(1234),
                "1+2+3+4 must be 10");
        assertEquals(7, LoopDrills.digitSum(7),
                "a single digit sums to itself");
        assertEquals(28, LoopDrills.digitSum(9847),
                "9+8+4+7 must be 28 — your loop must handle any length");
    }

    @Test
    void digitSumHandlesZeroAndNegatives() {
        assertEquals(0, LoopDrills.digitSum(0),
                "the digits of 0 sum to 0 — beware a while loop that never runs");
        assertEquals(14, LoopDrills.digitSum(-905),
                "the sign is ignored: 9+0+5 must be 14");
    }

    @Test
    void spotsPalindromeNumbers() {
        assertTrue(LoopDrills.isPalindromeNumber(121),
                "121 reversed is 121");
        assertTrue(LoopDrills.isPalindromeNumber(1221),
                "1221 reversed is 1221");
        assertTrue(LoopDrills.isPalindromeNumber(7),
                "a single digit always reads the same both ways");
        assertTrue(LoopDrills.isPalindromeNumber(0),
                "0 is a palindrome");
    }

    @Test
    void rejectsNonPalindromeAndNegativeNumbers() {
        assertFalse(LoopDrills.isPalindromeNumber(123),
                "123 reversed is 321, so it is not a palindrome");
        assertFalse(LoopDrills.isPalindromeNumber(10),
                "10 reversed is 01 = 1, so it is not a palindrome");
        assertFalse(LoopDrills.isPalindromeNumber(-121),
                "negatives are never palindromes — the minus sign is only on one end");
    }

    @Test
    void fizzBuzzLineBuildsTheExactString() {
        assertEquals("1 2 Fizz 4 Buzz", LoopDrills.fizzBuzzLine(5),
                "fizzBuzzLine(5) must be exactly \"1 2 Fizz 4 Buzz\" — no trailing space");
        assertEquals("1", LoopDrills.fizzBuzzLine(1),
                "fizzBuzzLine(1) is just \"1\" with nothing around it");
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",
                LoopDrills.fizzBuzzLine(15),
                "15 divides by both 3 and 5, so it must be FizzBuzz — check that case first");
    }

    @Test
    void fizzBuzzLineRejectsCountsBelowOne() {
        assertThrows(IllegalArgumentException.class,
                () -> LoopDrills.fizzBuzzLine(0),
                "counting up to 0 makes no sense — throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> LoopDrills.fizzBuzzLine(-3),
                "a negative count must throw IllegalArgumentException");
    }
}
