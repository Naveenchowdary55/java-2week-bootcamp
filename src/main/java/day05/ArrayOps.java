package day05;

/**
 * Day 05 — mutating an array in place. See day05/README.md.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class ArrayOps {

    /**
     * Reverse the array IN PLACE and return nothing.
     *
     * "In place" means you rearrange the SAME array the caller handed you — you
     * do NOT build a new array. After this call the caller's own array is
     * flipped, because an array variable points at one shared object in memory.
     *
     * Example: given arr = [1, 2, 3, 4], after reverseInPlace(arr)
     *          the same arr now holds [4, 3, 2, 1].
     * Example: given arr = [7], it stays [7] (nothing to swap).
     *
     * Hint: use two index cursors, one at the front (i = 0) and one at the back
     * (j = arr.length - 1). Swap arr[i] with arr[j], then move i forward and j
     * backward. Stop when they meet in the middle. To swap two values you need a
     * temporary variable to hold one of them.
     *
     * @param arr the array to reverse (never null)
     */
    public static void reverseInPlace(int[] arr) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
