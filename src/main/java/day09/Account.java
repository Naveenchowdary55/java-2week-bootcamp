// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * Base bank account. This class is PROVIDED complete — you do not change it.
 * Your job is to write two subclasses: {@link SavingsAccount} and
 * {@link CurrentAccount}.
 *
 * <p>The {@code balance} field is {@code protected}, which means subclasses can
 * see and use it directly (unlike {@code private}, which would hide it even
 * from subclasses).
 */
public class Account {

    /** Visible to subclasses so they can implement their own rules. */
    protected double balance;

    /**
     * @param openingBalance the starting balance; negative → IllegalArgumentException
     */
    public Account(double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("openingBalance must not be negative");
        }
        this.balance = openingBalance;
    }

    /**
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds money to the account.
     *
     * @param amount amount to add; must be > 0
     * @return true and increases the balance if valid; false and no change otherwise
     */
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    /**
     * Removes money from the account.
     *
     * @param amount amount to remove; must be > 0 and no more than the balance
     * @return true and decreases the balance if valid; false and no change otherwise
     */
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
