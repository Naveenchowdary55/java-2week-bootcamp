package day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ArrayOpsTest {

    @Test
    void reverseFlipsAnEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};
        ArrayOps.reverseInPlace(arr);
        assertArrayEquals(new int[] {4, 3, 2, 1}, arr,
                "after reverseInPlace, [1,2,3,4] must become [4,3,2,1]");
    }

    @Test
    void reverseFlipsAnOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayOps.reverseInPlace(arr);
        assertArrayEquals(new int[] {5, 4, 3, 2, 1}, arr,
                "with an odd length the middle element stays put: [1,2,3,4,5] -> [5,4,3,2,1]");
    }

    @Test
    void reverseMutatesTheSameArrayObject() {
        int[] arr = {10, 20, 30};
        int[] sameReference = arr;
        ArrayOps.reverseInPlace(arr);
        assertArrayEquals(new int[] {30, 20, 10}, sameReference,
                "in-place means the ORIGINAL array is changed, not a fresh copy");
    }

    @Test
    void reverseOfSingleElementIsUnchanged() {
        int[] arr = {7};
        ArrayOps.reverseInPlace(arr);
        assertArrayEquals(new int[] {7}, arr,
                "reversing a single-element array leaves it as [7]");
    }
}
