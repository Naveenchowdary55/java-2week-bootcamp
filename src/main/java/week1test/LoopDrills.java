package week1test;

/**
 * Week 1 Test — Problem 2 of 5 (EASY, 10 marks).
 *
 * Topics: while/for loops, digit maths with % and /, building a String in a loop.
 *
 * Do all three with loops. No String.valueOf(n).length(), no StringBuilder
 * reverse tricks on numbers — walk the digits yourself with % and /.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class LoopDrills {

    /**
     * Add up the digits of a number, however many there are.
     *
     * On Day 2 you did this for exactly four digits with no loop. Now do it for
     * any number, with a loop.
     *
     * The sign is ignored — the digits of -905 are 9, 0 and 5.
     *
     * Example: digitSum(1234) -> 10
     * Example: digitSum(7)    -> 7
     * Example: digitSum(0)    -> 0
     * Example: digitSum(-905) -> 14
     *
     * @param n any int
     * @return the sum of its digits, ignoring the sign
     */
    public static int digitSum(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Does this number read the same forwards and backwards?
     *
     * Reverse the digits with a loop and compare against the original. Do NOT
     * convert the number to a String.
     *
     * Negative numbers are never palindromes — the minus sign only sits on one
     * end. Return false for them rather than ignoring the sign.
     *
     * Example: isPalindromeNumber(121)  -> true
     * Example: isPalindromeNumber(1221) -> true
     * Example: isPalindromeNumber(7)    -> true    (a single digit always is)
     * Example: isPalindromeNumber(0)    -> true
     * Example: isPalindromeNumber(123)  -> false
     * Example: isPalindromeNumber(-121) -> false
     *
     * @param n any int
     * @return true if the digits are a palindrome
     */
    public static boolean isPalindromeNumber(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The classic FizzBuzz, as one line of text.
     *
     * Count from 1 to n. For each number print:
     *   "FizzBuzz" if it divides by both 3 and 5
     *   "Fizz"     if it divides by 3
     *   "Buzz"     if it divides by 5
     *   the number itself otherwise
     *
     * Join the entries with a SINGLE SPACE and put no space at the end. That
     * trailing-separator rule is the same one that caught you on Day 4 — the
     * test checks the exact String.
     *
     * Example: fizzBuzzLine(5)  -> "1 2 Fizz 4 Buzz"
     * Example: fizzBuzzLine(15) -> "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz"
     * Example: fizzBuzzLine(1)  -> "1"
     *
     * @param n how high to count, always 1 or more
     * @return the FizzBuzz sequence as a single space-separated line
     * @throws IllegalArgumentException if n is less than 1
     */
    public static String fizzBuzzLine(int n) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
