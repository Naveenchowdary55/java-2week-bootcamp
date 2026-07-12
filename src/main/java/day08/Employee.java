// Day 08 exercise — see src/main/java/day08/README.md
package day08;

/**
 * An Employee that automatically receives a unique, sequential id number the
 * moment it is created. The very first Employee you create gets some id, the
 * next one gets that id + 1, and so on.
 *
 * <p>The trick is a <b>static</b> counter shared by ALL Employee objects. Each
 * time a constructor runs, it reads the counter, hands that value to the new
 * employee as its id, and bumps the counter for the next one.
 *
 * <p>Example:
 * <pre>
 *   Employee a = new Employee("Asha");
 *   Employee b = new Employee("Ben");
 *   a.getId();   // e.g. 1
 *   b.getId();   // a.getId() + 1
 * </pre>
 */
public class Employee {

    /**
     * Creates an employee with the given name and assigns it the next unique id.
     *
     * <p>Hint: declare a {@code private static int} counter as a field of this
     * class (static fields are shared across every instance). In the constructor,
     * use it to set this employee's id, then increment it.
     *
     * @param name the employee's name
     */
    public Employee(String name) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return this employee's unique id (assigned once, at construction time)
     */
    public int getId() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return this employee's name
     */
    public String getName() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the total number of Employee objects ever created.
     *
     * <p>Hint: this is a {@code static} method — it belongs to the class, not to
     * any one employee, so it can only read static data (like your counter).
     */
    public static int getEmployeeCount() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
