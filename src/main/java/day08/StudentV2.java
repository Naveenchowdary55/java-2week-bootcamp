// Day 08 exercise — see src/main/java/day08/README.md
package day08;

/**
 * A student with two ways to be created — this is <b>constructor
 * overloading</b>. You can create a student with just a name and roll number,
 * or with a name, roll number, and an array of marks.
 *
 * <p>The two-argument constructor MUST NOT duplicate setup logic. Instead it
 * <b>chains</b> to the three-argument constructor using {@code this(...)},
 * passing an empty marks array. Calling {@code this(...)} runs the other
 * constructor first — it must be the very first statement.
 *
 * <p>Example:
 * <pre>
 *   StudentV2 a = new StudentV2("Asha", 12);              // no marks yet
 *   StudentV2 b = new StudentV2("Ben", 13, new int[]{80, 90});
 *   a.average();  // 0.0
 *   b.average();  // 85.0
 * </pre>
 */
public class StudentV2 {

    /**
     * Creates a student with no marks yet.
     *
     * <p>Required: this constructor must delegate to
     * {@link #StudentV2(String, int, int[])} via {@code this(name, rollNo, new int[0])}
     * as its first statement — do not repeat field assignments here.
     *
     * @param name   the student's name
     * @param rollNo the student's roll number
     */
    public StudentV2(String name, int rollNo) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Creates a student with a name, roll number, and marks.
     *
     * @param name   the student's name
     * @param rollNo the student's roll number
     * @param marks  the student's marks (may be empty)
     */
    public StudentV2(String name, int rollNo, int[] marks) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the student's name
     */
    public String getName() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the student's roll number
     */
    public int getRollNo() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the average of the marks, or 0.0 when there are no marks.
     */
    public double average() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
