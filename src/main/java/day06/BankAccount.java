package day06;

/**
 * Day 06 — an object that protects its own data. See day06/README.md.
 *
 * The balance should only ever change through deposit() and withdraw(), and only
 * when the amount makes sense. This is why we keep the balance in a PRIVATE field
 * and expose it through getBalance() rather than letting anyone set it directly.
 *
 * Declare your own fields (the stub has none). Replace each
 * `throw new UnsupportedOperationException(...)` with real code.
 */
public class BankAccount {

    /**
     * Open an account for an owner with a starting balance. Store both in your
     * own fields.
     *
     * @param owner          the account holder's name
     * @param openingBalance the starting balance
     */
    public BankAccount(String owner, double openingBalance) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Put money in.
     *
     * If {@code amount} is zero or negative, change nothing and return false.
     * Otherwise add it to the balance and return true.
     *
     * Example: balance 100, deposit(50) -> balance 150, returns true
     * Example: balance 100, deposit(-5) -> balance 100, returns false
     *
     * @param amount how much to add
     * @return true if the deposit happened, false if it was rejected
     */
    public boolean deposit(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Take money out.
     *
     * Reject (change nothing, return false) if {@code amount} is zero or negative,
     * OR if it is more than the current balance. Otherwise subtract it and return
     * true.
     *
     * Example: balance 100, withdraw(40)  -> balance 60, returns true
     * Example: balance 100, withdraw(150) -> balance 100, returns false
     * Example: balance 100, withdraw(0)   -> balance 100, returns false
     *
     * @param amount how much to take out
     * @return true if the withdrawal happened, false if it was rejected
     */
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the current balance
     */
    public double getBalance() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the owner's name
     */
    public String getOwner() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
