package week1test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArrayPuzzlesTest {

    @Test
    void rotatesLeftByTheGivenAmount() {
        assertArrayEquals(new int[] {3, 4, 5, 1, 2},
                ArrayPuzzles.rotateLeft(new int[] {1, 2, 3, 4, 5}, 2),
                "rotating [1,2,3,4,5] left by 2 must give [3,4,5,1,2]");
        assertArrayEquals(new int[] {1, 2, 3},
                ArrayPuzzles.rotateLeft(new int[] {1, 2, 3}, 0),
                "rotating by 0 must leave the order unchanged");
    }

    @Test
    void rotationWrapsAroundTheLength() {
        assertArrayEquals(new int[] {1, 2, 3},
                ArrayPuzzles.rotateLeft(new int[] {1, 2, 3}, 3),
                "rotating by the full length brings you back to the start");
        assertArrayEquals(new int[] {2, 3, 1},
                ArrayPuzzles.rotateLeft(new int[] {1, 2, 3}, 4),
                "rotating by 4 on a length-3 array is the same as rotating by 1");
        assertArrayEquals(new int[] {},
                ArrayPuzzles.rotateLeft(new int[] {}, 5),
                "an empty array rotates to an empty array — do not divide by zero");
    }

    @Test
    void rotateLeftDoesNotModifyTheInput() {
        int[] original = {1, 2, 3, 4, 5};
        ArrayPuzzles.rotateLeft(original, 2);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, original,
                "rotateLeft must return a NEW array and leave the caller's array untouched");
    }

    @Test
    void rotateLeftRejectsNegativeCounts() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayPuzzles.rotateLeft(new int[] {1, 2, 3}, -1),
                "a negative rotation must throw IllegalArgumentException");
    }

    @Test
    void findsTheMissingNumber() {
        assertEquals(3, ArrayPuzzles.missingNumber(new int[] {1, 2, 4, 5}),
                "1..5 with [1,2,4,5] present means 3 is missing");
        assertEquals(1, ArrayPuzzles.missingNumber(new int[] {2, 3, 4}),
                "the missing value can be the first one");
        assertEquals(4, ArrayPuzzles.missingNumber(new int[] {1, 2, 3}),
                "the missing value can be the last one");
    }

    @Test
    void findsTheMissingNumberWhenUnsorted() {
        assertEquals(4, ArrayPuzzles.missingNumber(new int[] {5, 1, 3, 2}),
                "the values are not sorted — do not assume arr[i] == i + 1");
        assertEquals(1, ArrayPuzzles.missingNumber(new int[] {}),
                "an empty array is missing 1, the only value in 1..1");
    }

    @Test
    void measuresTheLongestRun() {
        assertEquals(3, ArrayPuzzles.longestRun(new int[] {1, 1, 2, 2, 2, 3}),
                "the three 2s in a row make the longest run 3");
        assertEquals(4, ArrayPuzzles.longestRun(new int[] {4, 4, 4, 4}),
                "the whole array is one run of 4");
        assertEquals(1, ArrayPuzzles.longestRun(new int[] {1, 2, 3}),
                "with no repeats the longest run is 1");
    }

    @Test
    void longestRunCountsOnlyAdjacentValues() {
        assertEquals(2, ArrayPuzzles.longestRun(new int[] {1, 2, 1, 1}),
                "only the two ADJACENT 1s count — the first 1 is not next to them");
        assertEquals(1, ArrayPuzzles.longestRun(new int[] {7}),
                "a single element is a run of 1");
        assertEquals(0, ArrayPuzzles.longestRun(new int[] {}),
                "an empty array has no run at all");
    }

    @Test
    void findsPairsSummingToTheTarget() {
        assertTrue(ArrayPuzzles.hasPairWithSum(new int[] {1, 2, 3, 9}, 5),
                "2 + 3 is 5");
        assertTrue(ArrayPuzzles.hasPairWithSum(new int[] {-2, 5}, 3),
                "-2 + 5 is 3 — negatives work the same way");
        assertTrue(ArrayPuzzles.hasPairWithSum(new int[] {3, 3}, 6),
                "two different positions may hold the same value");
    }

    @Test
    void rejectsPairsThatDoNotExist() {
        assertFalse(ArrayPuzzles.hasPairWithSum(new int[] {1, 2, 3, 9}, 8),
                "no two of [1,2,3,9] add up to 8");
        assertFalse(ArrayPuzzles.hasPairWithSum(new int[] {3}, 6),
                "one element cannot pair with ITSELF — the indexes must differ");
        assertFalse(ArrayPuzzles.hasPairWithSum(new int[] {}, 0),
                "an empty array has no pairs");
    }
}
