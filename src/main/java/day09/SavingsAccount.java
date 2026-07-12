// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A savings account — an {@link Account} that can earn interest. It inherits
 * deposit and withdraw unchanged and adds one new ability: {@link #addInterest(double)}.
 *
 * <p>Example:
 * <pre>
 *   SavingsAccount s = new SavingsAccount(1000.0);
 *   s.addInterest(5.0);   // adds 1000 * 5/100 = 50, balance becomes 1050
 * </pre>
 */
public class SavingsAccount extends Account {

    /**
     * Creates a savings account.
     *
     * <p>Hint: the parent {@link Account} has no no-argument constructor, so
     * your first statement must be {@code super(openingBalance)} to run the
     * parent's setup and validation.
     *
     * @param openingBalance the starting balance; negative → IllegalArgumentException (handled by super)
     */
    public SavingsAccount(double openingBalance) {
        super(openingBalance);
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Adds interest to the balance: balance increases by balance × ratePercent / 100.
     *
     * @param ratePercent the interest rate as a percentage (e.g. 5.0 for 5%);
     *                    negative → throw {@link IllegalArgumentException}
     */
    public void addInterest(double ratePercent) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
