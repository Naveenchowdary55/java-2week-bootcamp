package day02;

/**
 * Day 02 exercise. See day02/README.md.
 *
 * Practise doubles and arithmetic operators. Replace each
 * `throw new UnsupportedOperationException(...)` with real code.
 */
public class InterestCalculator {

    /**
     * Simple interest = principal * rate * years / 100.
     *
     * Example: simpleInterest(1000, 5, 2) -> 100.0   (1000 * 5 * 2 / 100)
     * Example: simpleInterest(2000, 10, 1) -> 200.0
     *
     * Hint: the rate arrives as a percent (5 means 5%), so remember to divide by 100.
     *
     * @param principal the starting amount
     * @param ratePercent the yearly interest rate, as a percent
     * @param years how many years the money is invested
     * @return the interest earned
     */
    public static double simpleInterest(double principal, double ratePercent, double years) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Total amount = principal + simpleInterest(...).
     *
     * Example: totalAmount(1000, 5, 2) -> 1100.0   (1000 + 100)
     *
     * Hint: reuse simpleInterest instead of repeating the formula.
     *
     * @param principal the starting amount
     * @param ratePercent the yearly interest rate, as a percent
     * @param years how many years the money is invested
     * @return principal plus the interest earned
     */
    public static double totalAmount(double principal, double ratePercent, double years) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
