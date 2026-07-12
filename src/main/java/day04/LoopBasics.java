package day04;

/**
 * Day 04 exercise. See day04/README.md.
 *
 * Your first real loops. Replace each
 * `throw new UnsupportedOperationException(...)` with real code.
 */
public class LoopBasics {

    /**
     * Add up all the even numbers from 2 up to n (inclusive).
     *
     * Example: sumOfEvens(10) -> 30   (2 + 4 + 6 + 8 + 10)
     * Example: sumOfEvens(1)  -> 0    (nothing to add; n < 2)
     * Example: sumOfEvens(5)  -> 6    (2 + 4)
     *
     * Hint: loop a counter from 2 to n, stepping by 2, and keep a running total.
     *
     * @param n the upper bound (inclusive)
     * @return the sum of even numbers in 2..n, or 0 if n < 2
     */
    public static int sumOfEvens(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Build the times table for n, from 1 to 10, as one String.
     *
     * Each line looks like:  n x i = result
     * Lines are joined with '\n' and there is NO trailing newline at the end.
     *
     * Example: multiplicationTable(3) returns exactly:
     *   3 x 1 = 3
     *   3 x 2 = 6
     *   3 x 3 = 9
     *   3 x 4 = 12
     *   3 x 5 = 15
     *   3 x 6 = 18
     *   3 x 7 = 21
     *   3 x 8 = 24
     *   3 x 9 = 27
     *   3 x 10 = 30
     *
     * Hint: build the text with a StringBuilder. Add '\n' BEFORE lines 2..10 (or after
     * lines 1..9) so the last line has no newline after it.
     *
     * @param n the number whose table you print
     * @return the 10-line table as a single String
     */
    public static String multiplicationTable(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
