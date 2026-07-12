// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A current account — an {@link Account} with an overdraft. It <b>overrides</b>
 * {@link #withdraw(double)} so the balance may go negative, but only down to
 * {@code -overdraftLimit}.
 *
 * <p>Example:
 * <pre>
 *   CurrentAccount c = new CurrentAccount(100.0, 50.0);
 *   c.withdraw(120);  // true, balance becomes -20 (within the -50 limit)
 *   c.withdraw(50);   // false, would go to -70, past the -50 limit
 * </pre>
 */
public class CurrentAccount extends Account {

    /**
     * Creates a current account with an overdraft limit.
     *
     * <p>Hint: call {@code super(openingBalance)} first, then store the
     * overdraft limit in a field so your overridden {@code withdraw} can use it.
     *
     * @param openingBalance the starting balance; negative → IllegalArgumentException (handled by super)
     * @param overdraftLimit how far below zero the balance may go
     */
    public CurrentAccount(double openingBalance, double overdraftLimit) {
        super(openingBalance);
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Removes money, allowing the balance to drop as low as {@code -overdraftLimit}.
     *
     * <p>A withdrawal that would push the balance below {@code -overdraftLimit}
     * must fail: return false and leave the balance unchanged. The amount must
     * still be > 0.
     *
     * @param amount amount to remove; must be > 0
     * @return true and decreases the balance if within the overdraft; false and no change otherwise
     */
    @Override
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
