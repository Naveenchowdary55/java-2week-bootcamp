package day06;

/**
 * Day 06 — 2D arrays (the "grid"). See day06/README.md.
 *
 * This exercise was moved here from Day 5 so today isn't too heavy — you watched
 * 2D arrays yesterday, now you build with them. A 2D array is an array of rows,
 * where each row is itself an array. `m[r][c]` is the value at row r, column c.
 * `m.length` is the number of rows; `m[0].length` is the number of columns.
 *
 * Replace the `throw new UnsupportedOperationException(...)` with real code.
 */
public class MatrixMath {

    /**
     * Add two matrices element by element into a BRAND NEW matrix (do not modify
     * a or b). Result cell [r][c] = a[r][c] + b[r][c].
     *
     * Example:
     *   a = {{1, 2},      b = {{5, 6},      result = {{6,  8},
     *        {3, 4}}           {7, 8}}                {10, 12}}
     *
     * Both matrices must be the same shape (same number of rows AND same number
     * of columns). If they are not, throw IllegalArgumentException.
     *
     * Hint: make `int[][] result = new int[rows][cols];` then use TWO nested
     * loops — the outer over rows, the inner over columns.
     *
     * @param a the first matrix (rectangular, never null)
     * @param b the second matrix (rectangular, never null)
     * @return a new matrix holding the element-wise sums
     * @throws IllegalArgumentException if the dimensions do not match
     */
    public static int[][] add(int[][] a, int[][] b) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
