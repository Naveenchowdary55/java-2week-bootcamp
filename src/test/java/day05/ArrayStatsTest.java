package day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArrayStatsTest {

    @Test
    void sumAddsEveryElement() {
        assertEquals(6, ArrayStats.sum(new int[] {1, 2, 3}),
                "sum([1,2,3]) must add up to 6");
        assertEquals(0, ArrayStats.sum(new int[] {}),
                "sum of an empty array is 0 — there is nothing to add");
    }

    @Test
    void averageIsTheMean() {
        assertEquals(4.0, ArrayStats.average(new int[] {2, 4, 6}), 1e-9,
                "average([2,4,6]) must be 4.0");
        assertEquals(1.5, ArrayStats.average(new int[] {1, 2}), 1e-9,
                "average([1,2]) must be 1.5 — remember to divide as doubles");
    }

    @Test
    void averageOfEmptyArrayIsRejected() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayStats.average(new int[] {}),
                "an empty array has no average, so it must throw IllegalArgumentException");
    }

    @Test
    void maxAndMinFindTheExtremes() {
        assertEquals(9, ArrayStats.max(new int[] {5, 1, 9, 7}),
                "max([5,1,9,7]) must be 9");
        assertEquals(-3, ArrayStats.max(new int[] {-3, -8}),
                "max([-3,-8]) must be -3 — do not assume the biggest is positive");
        assertEquals(1, ArrayStats.min(new int[] {5, 1, 9, 7}),
                "min([5,1,9,7]) must be 1");
        assertEquals(-8, ArrayStats.min(new int[] {-3, -8}),
                "min([-3,-8]) must be -8");
    }

    @Test
    void maxAndMinRejectEmptyArrays() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayStats.max(new int[] {}),
                "max of an empty array must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> ArrayStats.min(new int[] {}),
                "min of an empty array must throw IllegalArgumentException");
    }

    @Test
    void secondLargestUsesDistinctValues() {
        assertEquals(7, ArrayStats.secondLargest(new int[] {5, 1, 9, 7}),
                "secondLargest([5,1,9,7]) must be 7");
        assertEquals(3, ArrayStats.secondLargest(new int[] {9, 9, 3}),
                "secondLargest([9,9,3]) must be 3 — duplicate 9s do not count as second");
        assertEquals(3, ArrayStats.secondLargest(new int[] {1, 2, 3, 4}),
                "secondLargest of an ascending array [1,2,3,4] must be 3");
    }

    @Test
    void secondLargestRejectsWhenNoSecondDistinctValueExists() {
        assertThrows(IllegalArgumentException.class,
                () -> ArrayStats.secondLargest(new int[] {5}),
                "a length-1 array has no second value, so it must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> ArrayStats.secondLargest(new int[] {4, 4, 4}),
                "when every element is equal there is no second DISTINCT value, so it must throw");
    }
}
