package week1test;

/**
 * Week 1 Test — Problem 1 of 5 (EASY, 10 marks).
 *
 * Topics: if/else, boolean logic, input validation, boundary conditions.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class TriangleClassifier {

    /**
     * Classify a triangle from the lengths of its three sides.
     *
     * Return one of exactly these four Strings (uppercase, no spaces):
     *   "EQUILATERAL" — all three sides equal
     *   "ISOSCELES"   — exactly two sides equal
     *   "SCALENE"     — no two sides equal
     *   "INVALID"     — the three lengths cannot form a triangle
     *
     * Lengths cannot form a triangle when any side is zero or negative, OR when
     * the sum of any two sides is not strictly greater than the third. Check
     * validity FIRST — an invalid input is "INVALID" even if its sides are all
     * equal.
     *
     * Example: kind(3, 3, 3)   -> "EQUILATERAL"
     * Example: kind(5, 5, 8)   -> "ISOSCELES"
     * Example: kind(3, 4, 5)   -> "SCALENE"
     * Example: kind(1, 2, 3)   -> "INVALID"   (1 + 2 is not greater than 3)
     * Example: kind(0, 0, 0)   -> "INVALID"   (zero-length sides)
     * Example: kind(-3, 4, 5)  -> "INVALID"
     *
     * The order of the arguments must not matter: kind(8, 5, 5) and
     * kind(5, 8, 5) are both "ISOSCELES".
     *
     * @param a first side length
     * @param b second side length
     * @param c third side length
     * @return "EQUILATERAL", "ISOSCELES", "SCALENE", or "INVALID"
     */
    public static String kind(int a, int b, int c) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Is this a right-angled triangle?
     *
     * True when the lengths form a valid triangle AND the square of the longest
     * side equals the sum of the squares of the other two. The arguments arrive
     * in no particular order — the longest side is not necessarily {@code c}.
     *
     * An invalid triangle is never right-angled: return false, do not throw.
     *
     * Example: isRightAngled(3, 4, 5) -> true
     * Example: isRightAngled(5, 3, 4) -> true    (same triangle, reordered)
     * Example: isRightAngled(5, 12, 13) -> true
     * Example: isRightAngled(2, 3, 4) -> false
     * Example: isRightAngled(1, 2, 3) -> false   (not a valid triangle at all)
     *
     * @param a first side length
     * @param b second side length
     * @param c third side length
     * @return true if the sides form a valid right-angled triangle
     */
    public static boolean isRightAngled(int a, int b, int c) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
