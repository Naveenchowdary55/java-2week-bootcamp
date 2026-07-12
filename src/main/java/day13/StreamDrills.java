// Day 13 exercise — see src/main/java/day13/README.md
package day13;

import java.util.List;

import day12.StudentRecord;

/**
 * A first taste of the Stream API. A stream is a pipeline: you take a collection,
 * push it through a chain of steps (keep some, transform each, sort, combine),
 * and get a result out the other end — all without writing an explicit loop.
 *
 * <p>Today is EXPOSURE, not mastery. Get these two chains working, then write the
 * plain-loop equivalent in a comment so you can see they do the same thing.
 */
public class StreamDrills {

    /**
     * Keeps the even numbers, squares each, and adds them all up — in ONE stream
     * chain (the Javadoc requires a stream here, not a manual loop).
     *
     * <p>Example: {@code [1, 2, 3, 4]} → evens are {@code 2, 4} → squared
     * {@code 4, 16} → sum {@code 20}.
     *
     * <p>Hint:
     * <pre>
     *   return numbers.stream()
     *                 .filter(n -&gt; n % 2 == 0)   // keep evens
     *                 .map(n -&gt; n * n)           // square each
     *                 .reduce(0, Integer::sum);  // add them up
     * </pre>
     *
     * <p>AFTER it passes, write the equivalent plain {@code for} loop in a comment
     * right below this method, so you can compare the two side by side.
     *
     * @param numbers the input numbers
     * @return the sum of the squares of the even numbers (0 if none)
     */
    public static int evensSquaredSum(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Returns the names of the students who scored MORE than 75, ordered from the
     * highest mark down — in ONE stream chain.
     *
     * <p>Hint:
     * <pre>
     *   return students.stream()
     *                  .filter(s -&gt; s.getMarks() &gt; 75)
     *                  .sorted(Comparator.comparingInt(StudentRecord::getMarks).reversed())
     *                  .map(StudentRecord::getName)
     *                  .collect(Collectors.toList());
     * </pre>
     *
     * @param students the students to consider
     * @return names of students scoring above 75, highest mark first
     */
    public static List<String> topScorers(List<StudentRecord> students) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
