package week1test;

/**
 * Week 1 Test — Problem 4 of 5 (MEDIUM, 20 marks).
 *
 * Topics: arrays, index arithmetic, single-pass scanning, nested loops.
 *
 * Loops only. No Arrays.sort, no Arrays.copyOf, no System.arraycopy, no
 * streams, no Collections. Allocating `new int[n]` is of course fine.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class ArrayPuzzles {

    /**
     * Rotate the array left by k positions and return the result as a NEW array.
     *
     * Rotating left by 1 moves every element one place towards the front, and
     * the element that falls off the front reappears at the back.
     *
     * The input array must NOT be modified — the test checks that afterwards.
     *
     * k may be larger than the array: rotating a 3-element array by 4 is the
     * same as rotating it by 1. k is never negative.
     *
     * Example: rotateLeft([1, 2, 3, 4, 5], 2) -> [3, 4, 5, 1, 2]
     * Example: rotateLeft([1, 2, 3], 0)       -> [1, 2, 3]
     * Example: rotateLeft([1, 2, 3], 3)       -> [1, 2, 3]   (full turn)
     * Example: rotateLeft([1, 2, 3], 4)       -> [2, 3, 1]   (4 wraps to 1)
     * Example: rotateLeft([], 5)              -> []
     *
     * @param arr the numbers, never null, not modified by this method
     * @param k how many positions to rotate left, never negative
     * @return a new array holding the rotated values
     * @throws IllegalArgumentException if k is negative
     */
    public static int[] rotateLeft(int[] arr, int k) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Find the one missing number.
     *
     * The array holds distinct numbers taken from 1, 2, 3, ... up to
     * arr.length + 1, with exactly one of them left out. Return the missing one.
     * The values are NOT necessarily in order.
     *
     * Example: missingNumber([1, 2, 4, 5]) -> 3   (from 1..5)
     * Example: missingNumber([2, 3, 4])    -> 1   (from 1..4)
     * Example: missingNumber([1, 2, 3])    -> 4   (from 1..4)
     * Example: missingNumber([5, 1, 3, 2]) -> 4   (order does not matter)
     * Example: missingNumber([])           -> 1   (from 1..1)
     *
     * @param arr the numbers present, never null
     * @return the single value from 1..arr.length+1 that is absent
     */
    public static int missingNumber(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The length of the longest run of equal values sitting next to each other.
     *
     * Only ADJACENT equal values count as a run. In [1, 2, 1, 1] the answer is
     * 2, not 3 — the first 1 is not next to the other two.
     *
     * Example: longestRun([1, 1, 2, 2, 2, 3]) -> 3
     * Example: longestRun([1, 2, 3])          -> 1
     * Example: longestRun([4, 4, 4, 4])       -> 4
     * Example: longestRun([1, 2, 1, 1])       -> 2
     * Example: longestRun([7])                -> 1
     * Example: longestRun([])                 -> 0
     *
     * @param arr the numbers, never null
     * @return the length of the longest adjacent equal run, 0 for an empty array
     */
    public static int longestRun(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Are there two elements at DIFFERENT positions that add up to the target?
     *
     * The two elements must come from two different indexes, but they are
     * allowed to hold the same value: [3, 3] does contain a pair summing to 6.
     * A single element may not be paired with itself: [3] does not.
     *
     * Example: hasPairWithSum([1, 2, 3, 9], 5)  -> true    (2 + 3)
     * Example: hasPairWithSum([1, 2, 3, 9], 8)  -> false
     * Example: hasPairWithSum([3, 3], 6)        -> true
     * Example: hasPairWithSum([3], 6)           -> false
     * Example: hasPairWithSum([-2, 5], 3)       -> true
     * Example: hasPairWithSum([], 0)            -> false
     *
     * @param arr the numbers, never null
     * @param target the sum to look for
     * @return true if some two elements at different indexes sum to target
     */
    public static boolean hasPairWithSum(int[] arr, int target) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
