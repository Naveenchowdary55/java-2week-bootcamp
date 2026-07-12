package day06;

/**
 * Day 06 — a class that bundles data (name, roll number, marks) with behaviour
 * (average, grade). See day06/README.md.
 *
 * You must declare your own fields to remember the constructor's arguments —
 * the stub deliberately has none. A field is a variable that belongs to the
 * object and lives as long as the object does, e.g.:
 *
 *   private String name;
 *
 * Then in the constructor do `this.name = name;` to store it.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class Student {

    /**
     * Build a student. Store each argument in one of your own fields so the
     * getters and calculations below can read them back later.
     *
     * @param name  the student's name
     * @param rollNo the student's roll number
     * @param marks  their marks (may be null or empty for a student with no marks)
     */
    public Student(String name, int rollNo, int[] marks) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the name you stored in the constructor
     */
    public String getName() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the roll number you stored in the constructor
     */
    public int getRollNo() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The average of this student's marks.
     *
     * Example: marks [80, 90, 100] -> 90.0
     * If there are no marks (null array or empty array), the average is 0.0 —
     * do NOT divide by zero.
     *
     * @return the mean of the marks, or 0.0 when there are none
     */
    public double average() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * The letter grade for this student, based on their {@link #average()} using
     * the Day 3 scale:
     *   90 and above -> 'A'
     *   75 and above -> 'B'
     *   60 and above -> 'C'
     *   40 and above -> 'D'
     *   below 40     -> 'F'
     *
     * Example: average 92.0 -> 'A'    Example: average 55.0 -> 'D'
     *
     * Hint: call your own average() method — don't recompute it here.
     *
     * @return the grade letter
     */
    public char grade() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
