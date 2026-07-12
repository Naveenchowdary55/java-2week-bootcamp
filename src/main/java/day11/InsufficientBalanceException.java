// Day 11 exercise — see src/main/java/day11/README.md
package day11;

/**
 * PROVIDED, complete — do not change. A CHECKED exception (it extends
 * {@code Exception}, not {@code RuntimeException}).
 *
 * <p>"Checked" means the compiler forces callers to deal with it: any method
 * that can throw this must either declare {@code throws InsufficientBalanceException}
 * or wrap the call in try/catch. It models a business rule that a caller can
 * reasonably recover from (e.g. ask the user for a smaller amount).
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
