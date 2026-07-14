package day04;

/**
 * Day 04 exercise. See day04/README.md.
 *
 * Classic loop puzzles over numbers. Replace each
 * `throw new UnsupportedOperationException(...)` with real code.
 */
public class NumberOps {

    /**
     * Reverse the digits of a non-negative number.
     *
     * Example: reverseDigits(1234) -> 4321
     * Example: reverseDigits(1200) -> 21    (leading zeros just disappear)
     * Example: reverseDigits(0)    -> 0
     *
     * Hint: peel off the last digit with % 10, and build the answer as
     * result = result * 10 + digit, while shrinking n with / 10.
     *
     * @param n a number >= 0
     * @return the number with its digits reversed
     */
    public static int reverseDigits(int n) {
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n /= 10; // Remove the last digit from n
        }
        return reversed;
          
        

    }

    /**
     * Decide whether n is prime.
     *
     * A prime is a whole number > 1 whose only divisors are 1 and itself.
     *
     * Example: isPrime(7)  -> true
     * Example: isPrime(1)  -> false   (1 is not prime)
     * Example: isPrime(9)  -> false   (divisible by 3)
     *
     * Hint: numbers below 2 are never prime. Otherwise, test divisors from 2 upward;
     * if any divides n evenly, it is not prime.
     *
     * @param n the number to test
     * @return true if n is prime
     */
    public static boolean isPrime(int n) {
        return n > 1 && java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

    /**
     * Collect every prime from 2 up to n (inclusive), in increasing order.
     *
     * Example: primesUpTo(10) -> [2, 3, 5, 7]
     * Example: primesUpTo(1)  -> []   (empty array, no primes)
     *
     * Hint: reuse isPrime. You may loop once to count how many primes there are, make
     * an int[] of that size, then loop again to fill it.
     *
     * @param n the upper bound (inclusive)
     * @return an array of the primes <= n, or an empty array if none
     */
    public static int[] primesUpTo(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        int[] primes = new int[count];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    /**
     * The first {@code terms} Fibonacci numbers, starting 0, 1.
     *
     * Example: fibonacci(1) -> [0]
     * Example: fibonacci(2) -> [0, 1]
     * Example: fibonacci(7) -> [0, 1, 1, 2, 3, 5, 8]
     * Example: fibonacci(0) -> []   (empty array)
     *
     * Hint: each number is the sum of the two before it. Use long values, because
     * Fibonacci numbers grow past the int limit quickly.
     *
     * @param terms how many Fibonacci numbers to produce (0 or more)
     * @return a long[] of the first {@code terms} Fibonacci numbers
     */
    public static long[] fibonacci(int terms) {
        if (terms <= 0) {
            return new long[0];
        }
        long[] fib = new long[terms];
        fib[0] = 0;
        if (terms > 1) {
            fib[1] = 1;
            for (int i = 2; i < terms; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
}
