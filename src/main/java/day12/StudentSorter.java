// Day 12 exercise — see src/main/java/day12/README.md
package day12;

import java.util.List;

/**
 * Sorts students by marks, highest first. This is your first real
 * {@link java.util.Comparator}: a little object whose only job is to answer
 * "which of these two comes first?"
 */
public class StudentSorter {

    /**
     * Returns a NEW list of the students sorted by marks in DESCENDING order
     * (highest marks first). The input list must NOT be modified — the test
     * checks that.
     *
     * <p>You MUST use a {@code Comparator} (this is the skill being taught), not
     * a hand-written bubble sort.
     *
     * <p>Hint: copy the input into a new {@code ArrayList} first, then sort the
     * copy. {@code Comparator.comparingInt(StudentRecord::getMarks).reversed()}
     * gives you "by marks, descending" in one line. Then return the copy.
     *
     * <p>Students with equal marks may appear in any order.
     *
     * @param students the students to sort (not modified)
     * @return a new list sorted by marks, highest first
     */
    public static List<StudentRecord> sortedByMarksDescending(List<StudentRecord> students) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
