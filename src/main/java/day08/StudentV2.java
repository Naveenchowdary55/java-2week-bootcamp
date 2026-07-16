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
        this(name, rollNo, new int[0]);
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (rollNo <= 0) {
            throw new IllegalArgumentException("Roll number must be a positive integer");
        }
    }
        
    


        
    
    public static void main(String[] args) {
     
        StudentV2 a = new StudentV2("Asha", 12);              // no marks yet
        StudentV2 b = new StudentV2("Ben", 13, new int[]{80, 90});
        System.out.println(a.average());  // 0.0
        System.out.println(b.average());  // 85.0
        if (a.average() == 0.0 && b.average() == 85.0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
     


        


    }

    /**
     * Creates a student with a name, roll number, and marks.
     *
     * @param name   the student's name
     * @param rollNo the student's roll number
     * @param marks  the student's marks (may be empty)
     */
    public StudentV2(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    /**
     * @return the student's name
     */
    public String getName() {
        if (name == null) {
            throw new IllegalStateException("Name has not been set");
        }
        return name;
    }

    /**
     * @return the student's roll number
     */
    public int getRollNo() {
        if (rollNo == 0) {
            throw new IllegalStateException("Roll number has not been set");
        }
        return rollNo;
    }

    /**
     * @return the average of the marks, or 0.0 when there are no marks.
     */
    public double average() {
        if (marks.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}
