package day02;

/**
 * Day 02 exercise. See day02/README.md.
 *
 * This one teaches the two most useful integer operators:
 *   /  (integer division, throws away the remainder)   e.g. 1234 / 10 = 123
 *   %  (remainder / modulo)                             e.g. 1234 % 10 = 4
 */
public class DigitSum {

    /**
     * Add up the four digits of a 4-digit number.
     *
     * RULE: no loops allowed. Use only % and / to peel off each digit.
     * You have not learned loops yet, and the point is to feel how / and % work.
     *
     * The input is guaranteed to be between 1000 and 9999.
     *
     * Example: sumOfDigits4(1234) -> 10   (1 + 2 + 3 + 4)
     * Example: sumOfDigits4(9999) -> 36
     *
     * Hint: n % 10 gives you the last digit; n / 10 removes it. Do that four times.
     *
     * @param n a 4-digit number (1000..9999)
     * @return the sum of its four digits
     */
    public static int sumOfDigits4(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
