// Day 11 exercise — see src/main/java/day11/README.md
package day11;

/**
 * PROVIDED, complete — do not change. An UNCHECKED exception (it extends
 * {@code RuntimeException}).
 *
 * <p>"Unchecked" means the compiler does NOT force anyone to catch it. It models
 * a programming mistake — passing a negative or zero amount where a positive one
 * was required. The fix is to correct the calling code, not to catch it at
 * runtime. Compare this with {@link InsufficientBalanceException}.
 */
public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message);
    }
}
