package day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class SafeInputTest {

    @Test
    void skipsGarbageAndReturnsTheFirstValidInt() {
        // The Scanner reads from a String, not the keyboard. It should skip
        // "abc" (not a number) and "12.5" (a decimal, not an int) and return 42.
        Scanner sc = new Scanner("abc\n12.5\n42\n");
        assertEquals(42, SafeInput.readInt(sc, "Enter a number: "),
                "readInt should discard 'abc' and '12.5' and return the first real int, 42");
    }

    @Test
    void returnsImmediatelyWhenFirstTokenIsValid() {
        Scanner sc = new Scanner("7\n");
        assertEquals(7, SafeInput.readInt(sc, "Enter a number: "),
                "when the first token is already a valid int, return it straight away");
    }

    @Test
    void readsNegativeIntegers() {
        Scanner sc = new Scanner("oops\n-15\n");
        assertEquals(-15, SafeInput.readInt(sc, "Enter a number: "),
                "negative whole numbers are valid ints too");
    }

    @Test
    void readsTwoValuesInSequenceFromTheSameScanner() {
        // Proves your loop consumes exactly the tokens it needs and leaves the
        // rest for the next call.
        Scanner sc = new Scanner("x\n1\n2\n");
        assertEquals(1, SafeInput.readInt(sc, "first: "),
                "first call skips 'x' and returns 1");
        assertEquals(2, SafeInput.readInt(sc, "second: "),
                "second call returns 2 from the same Scanner");
    }
}
