// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * A student that knows how to print itself nicely. Every class in Java secretly
 * extends {@link Object}, which gives it a {@code toString()}. The default one
 * is ugly (something like {@code day10.StudentV3@1b6d3586}). Here you
 * <b>override</b> it so the student describes itself in a readable way.
 *
 * <p>When you write {@code System.out.println(student)}, Java calls
 * {@code student.toString()} automatically — that's why overriding it is worth
 * doing.
 *
 * <p>Example:
 * <pre>
 *   StudentV3 s = new StudentV3("Asha", 12);
 *   s.toString();   // "Student{name=Asha, rollNo=12}"
 * </pre>
 */
public class StudentV3 {

    /**
     * Creates a student.
     *
     * @param name   the student's name
     * @param rollNo the student's roll number
     */
    public StudentV3(String name, int rollNo) {
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
     * @return exactly {@code "Student{name=<name>, rollNo=<rollNo>}"},
     *         e.g. {@code "Student{name=Asha, rollNo=12}"}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
