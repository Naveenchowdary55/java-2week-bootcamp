package day05;

/**
 * Day 05 — statistics over an int[] using plain loops. See day05/README.md.
 *
 * IMPORTANT: do everything here with your own loops. Do NOT use Arrays.sort,
 * streams, Collections, or Math.max/Math.min helpers on the whole array. The
 * point of today is to feel how an index walks across an array.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class ArrayStats {

    /**
     * Add up every element of the array.
     *
     * Example: sum([1, 2, 3])   -> 6
     * Example: sum([])          -> 0   (nothing to add)
     *
     * Hint: keep a running total that starts at 0, then walk the array with a
     * for loop and add each element to the total.
     *
     * @param arr the numbers (may be empty, never null)
     * @return the sum of all elements
     */
    public static int sum(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The average (arithmetic mean) of the array.
     *
     * Example: average([2, 4, 6]) -> 4.0
     * Example: average([1, 2])    -> 1.5
     *
     * An empty array has no average, so throw IllegalArgumentException for it.
     *
     * Hint: reuse sum(arr), then divide. Watch out — if you divide two ints you
     * get an int. Cast to double first: (double) total / arr.length.
     *
     * @param arr the numbers (never null)
     * @return the mean as a double
     * @throws IllegalArgumentException if the array is empty
     */
    public static double average(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The largest value in the array.
     *
     * Example: max([5, 1, 9, 7]) -> 9
     * Example: max([-3, -8])     -> -3
     *
     * Hint: start by assuming the FIRST element is the biggest, then walk the
     * rest and update whenever you find something larger. Do not start from 0 —
     * an array of all-negative numbers would break that.
     *
     * @param arr the numbers (never null)
     * @return the maximum element
     * @throws IllegalArgumentException if the array is empty
     */
    public static int max(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The smallest value in the array.
     *
     * Example: min([5, 1, 9, 7]) -> 1
     * Example: min([-3, -8])     -> -8
     *
     * Hint: mirror image of max — assume the first element is smallest, then
     * update whenever you find something smaller.
     *
     * @param arr the numbers (never null)
     * @return the minimum element
     * @throws IllegalArgumentException if the array is empty
     */
    public static int min(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The second largest DISTINCT value in the array, found in ONE pass — no
     * sorting allowed (state it out loud if it helps: "I will not call sort").
     *
     * "Distinct" means duplicates of the biggest value do not count as second.
     * Example: secondLargest([5, 1, 9, 7]) -> 7
     * Example: secondLargest([9, 9, 3])    -> 3   (the extra 9 is ignored)
     * Example: secondLargest([1, 2, 3, 4]) -> 3
     *
     * If there is no second distinct value (fewer than 2 elements, or every
     * element is equal like [4, 4, 4]), throw IllegalArgumentException.
     *
     * Hint: track two values as you walk once — `largest` and `second`. When you
     * meet a number bigger than `largest`, the old largest becomes `second`.
     * When a number sits strictly between them, it becomes the new `second`.
     * Skip numbers equal to `largest` so duplicates never become `second`.
     *
     * @param arr the numbers (never null)
     * @return the second largest distinct value
     * @throws IllegalArgumentException if there is no second distinct value
     */
    public static int secondLargest(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
