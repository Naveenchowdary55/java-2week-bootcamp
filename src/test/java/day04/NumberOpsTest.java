package day04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberOpsTest {

    @Test
    void reverseDigitsWorks() {
        assertEquals(4321, NumberOps.reverseDigits(1234),
                "reverseDigits(1234) = 4321");
        assertEquals(21, NumberOps.reverseDigits(1200),
                "reverseDigits(1200) = 21 (trailing zeros become leading and vanish)");
        assertEquals(0, NumberOps.reverseDigits(0),
                "reverseDigits(0) = 0");
    }

    @Test
    void isPrimeKnowsPrimesAndNonPrimes() {
        assertTrue(NumberOps.isPrime(7), "7 is prime");
        assertTrue(NumberOps.isPrime(2), "2 is the smallest prime");
        assertFalse(NumberOps.isPrime(1), "1 is not prime");
        assertFalse(NumberOps.isPrime(9), "9 = 3*3 is not prime");
        assertFalse(NumberOps.isPrime(0), "0 is not prime");
    }

    @Test
    void primesUpToTenAreExact() {
        assertArrayEquals(new int[] {2, 3, 5, 7}, NumberOps.primesUpTo(10),
                "primesUpTo(10) must be [2, 3, 5, 7]");
    }

    @Test
    void primesUpToOneIsEmpty() {
        assertArrayEquals(new int[] {}, NumberOps.primesUpTo(1),
                "primesUpTo(1) has no primes, so it is an empty array");
    }

    @Test
    void fibonacciSequenceIsCorrect() {
        assertArrayEquals(new long[] {0}, NumberOps.fibonacci(1),
                "fibonacci(1) = [0]");
        assertArrayEquals(new long[] {}, NumberOps.fibonacci(0),
                "fibonacci(0) = [] (empty)");
        assertArrayEquals(new long[] {0, 1, 1, 2, 3, 5, 8}, NumberOps.fibonacci(7),
                "fibonacci(7) = [0, 1, 1, 2, 3, 5, 8]");
    }
}
