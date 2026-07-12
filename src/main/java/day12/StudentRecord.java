// Day 12 exercise — see src/main/java/day12/README.md
package day12;

/**
 * PROVIDED, complete — do not change. An immutable student record: once you
 * build one, its name and marks never change (both fields are {@code final} and
 * there are no setters). You will store these in Lists and sort them.
 */
public final class StudentRecord {

    private final String name;
    private final int marks;

    public StudentRecord(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}
