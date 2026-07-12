package day03;

/**
 * Day 03 exercise. See day03/README.md.
 *
 * Practise combining boolean conditions with && and ||.
 */
public class LeapYear {

    /**
     * Decide whether a year is a leap year.
     *
     * The rule:
     *   - divisible by 4  -> usually a leap year,
     *   - BUT century years (divisible by 100) are NOT leap years,
     *   - UNLESS they are also divisible by 400.
     *
     * Example: isLeap(2024) -> true   (divisible by 4, not a century)
     * Example: isLeap(1900) -> false  (century, not divisible by 400)
     * Example: isLeap(2000) -> true   (century AND divisible by 400)
     * Example: isLeap(2023) -> false
     *
     * Hint: (divisible by 4 AND not divisible by 100) OR (divisible by 400).
     *
     * @param year the year to test
     * @return true if it is a leap year
     */
    public static boolean isLeap(int year) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
