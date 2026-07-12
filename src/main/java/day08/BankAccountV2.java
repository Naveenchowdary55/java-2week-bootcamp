// Day 08 exercise — see src/main/java/day08/README.md
package day08;

/**
 * A fully <b>encapsulated</b> bank account. Compared to Day 6, the balance can
 * no longer be set directly from outside — the only ways to change it are
 * {@link #deposit(double)} and {@link #withdraw(double)}. This is the whole
 * point of encapsulation: the object protects its own data and enforces the
 * rules.
 *
 * <p>The account also tracks, with a <b>static</b> counter, how many accounts
 * have ever been created.
 *
 * <p>Example:
 * <pre>
 *   BankAccountV2 acc = new BankAccountV2("Asha", 100.0);
 *   acc.deposit(50);   // true, balance 150
 *   acc.withdraw(500); // false, balance unchanged
 * </pre>
 */
public class BankAccountV2 {

    /**
     * Creates an account for an owner with an opening balance.
     *
     * <p>Validate FIRST, then set up the object:
     * <ul>
     *   <li>{@code openingBalance < 0} → throw {@link IllegalArgumentException}</li>
     *   <li>{@code owner} null or blank → throw {@link IllegalArgumentException}</li>
     * </ul>
     *
     * <p>Hint: only increment the static account counter AFTER validation passes,
     * so a rejected construction does not count as an account.
     *
     * @param owner          the account holder's name (must be non-null, non-blank)
     * @param openingBalance the starting balance (must be >= 0)
     */
    public BankAccountV2(String owner, double openingBalance) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the account owner's name
     */
    public String getOwner() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Changes the owner's name.
     *
     * @param owner the new owner name; null or blank → throw {@link IllegalArgumentException}
     */
    public void setOwner(String owner) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the current balance.
     *
     * <p>Note: there is deliberately NO {@code setBalance} method. The README
     * explains why — money should only move through deposit/withdraw so the
     * rules are always enforced.
     */
    public double getBalance() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Adds money to the account.
     *
     * @param amount amount to add; must be > 0
     * @return true and increases the balance if valid; false and no change otherwise
     */
    public boolean deposit(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Removes money from the account.
     *
     * @param amount amount to remove; must be > 0 and no more than the balance
     * @return true and decreases the balance if valid; false and no change otherwise
     */
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the total number of accounts ever successfully created.
     */
    public static int getAccountCount() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
