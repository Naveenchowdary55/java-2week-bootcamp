// Day 13 exercise — see src/main/java/day13/README.md
package day13;

/**
 * A counter that is safe to increment from several threads at once. In the
 * warm-up you watched an unprotected counter lose increments; this class is the
 * fix.
 *
 * <p>The whole lesson lives in one keyword: {@code synchronized}. When a method
 * is {@code synchronized}, only one thread can be inside it at a time — the
 * others wait their turn. That turns the three hidden steps of {@code count++}
 * (read, add, write) into one indivisible action, so no increment gets lost.
 *
 * <p>You declare the field yourself: a {@code private int count;}.
 */
public class SyncCounter {

    /**
     * Adds one to the count. MUST be thread-safe.
     *
     * <p>Hint: put the {@code synchronized} keyword in the method signature —
     * {@code public synchronized void increment()} — and then just do
     * {@code count++;}. That keyword is the entire exercise.
     */
    public void increment() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the current count
     */
    public int getCount() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
