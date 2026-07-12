// Day 12 exercise — see src/main/java/day12/README.md
package day12;

import java.util.List;

/**
 * Removes duplicate numbers while keeping the ORDER they first appeared in.
 * A plain {@link java.util.HashSet} would remove duplicates but scramble the
 * order — the trick here is keeping both.
 */
public class Dedup {

    /**
     * Returns a NEW list containing each value from {@code input} exactly once,
     * in the order of its first appearance. The input list is not modified.
     *
     * <p>Example:
     * <pre>
     *   removeDuplicates([3, 1, 3, 2, 1])  →  [3, 1, 2]
     * </pre>
     *
     * <p>Hint: a {@link java.util.LinkedHashSet} remembers insertion order AND
     * rejects duplicates, so adding everything to one and copying it back out is
     * the short path. (Or: loop with a normal {@code HashSet} to track "have I
     * seen this?" and add to the result only the first time.)
     *
     * @param input the numbers to deduplicate (not modified)
     * @return a new list of first-occurrence-ordered unique values
     */
    public static List<Integer> removeDuplicates(List<Integer> input) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
