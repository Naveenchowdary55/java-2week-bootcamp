// Day 11 exercise — see src/main/java/day11/README.md
package day11;

/**
 * A bank account that refuses to end up in an impossible state. Instead of
 * silently ignoring bad input, it THROWS — and the type of exception it throws
 * tells the caller how serious the problem is.
 *
 * <p>Two kinds of trouble, two kinds of exception:
 * <ul>
 *   <li>A bad amount (zero or negative) is a caller BUG → throw the unchecked
 *       {@link InvalidAmountException}. Callers are not forced to catch it.</li>
 *   <li>Trying to withdraw more than the balance is a recoverable BUSINESS
 *       situation → throw the checked {@link InsufficientBalanceException}.
 *       Callers ARE forced to handle it (notice the {@code throws} on withdraw).</li>
 * </ul>
 *
 * <p>Do not declare fields in the stub beyond what you need — you decide how to
 * store the owner and balance.
 *
 * <p>Example:
 * <pre>
 *   SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
 *   acc.deposit(50);      // balance 150
 *   acc.withdraw(30);     // balance 120  (must be inside try/catch)
 *   acc.withdraw(1000);   // throws InsufficientBalanceException
 * </pre>
 */
public class SafeBankAccount {

    /**
     * Creates an account for {@code owner} with the given opening balance.
     *
     * @param owner          the account owner's name
     * @param openingBalance the starting balance; must be >= 0
     * @throws InvalidAmountException if {@code openingBalance} is negative
     */
    public SafeBankAccount(String owner, double openingBalance) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the current balance
     */
    public double getBalance() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Adds money to the account.
     *
     * @param amount how much to deposit; must be > 0
     * @throws InvalidAmountException if {@code amount} is zero or negative.
     *         This is unchecked, so callers are NOT forced to catch it — a bad
     *         deposit amount is a programming mistake, not a business event.
     */
    public void deposit(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Removes money from the account.
     *
     * @param amount how much to withdraw; must be > 0 and <= the balance
     * @throws InvalidAmountException         if {@code amount} is zero or negative
     *                                        (unchecked — a caller bug)
     * @throws InsufficientBalanceException   if {@code amount} is greater than the
     *                                        balance. This is CHECKED — the
     *                                        {@code throws} keyword below forces
     *                                        every caller to decide what to do
     *                                        when there isn't enough money. Put
     *                                        the shortfall or balance in the
     *                                        message so the caller can tell the user.
     */
    public void withdraw(double amount) throws InsufficientBalanceException {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
