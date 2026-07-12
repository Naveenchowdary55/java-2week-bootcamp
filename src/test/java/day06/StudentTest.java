package day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void storesAndReturnsNameAndRollNo() {
        Student s = new Student("Asha", 12, new int[] {80, 90});
        assertEquals("Asha", s.getName(),
                "getName must return the name passed to the constructor");
        assertEquals(12, s.getRollNo(),
                "getRollNo must return the roll number passed to the constructor");
    }

    @Test
    void averageIsTheMeanOfMarks() {
        Student s = new Student("Ravi", 7, new int[] {80, 90, 100});
        assertEquals(90.0, s.average(), 1e-9,
                "average of [80, 90, 100] must be 90.0");
    }

    @Test
    void averageOfNoMarksIsZero() {
        Student empty = new Student("Nobody", 1, new int[] {});
        assertEquals(0.0, empty.average(), 1e-9,
                "a student with an empty marks array must average 0.0, not crash");
        Student nullMarks = new Student("Null", 2, null);
        assertEquals(0.0, nullMarks.average(), 1e-9,
                "a student with null marks must also average 0.0");
    }

    @Test
    void gradeUsesTheAverageOnTheStandardScale() {
        assertEquals('A', new Student("A", 1, new int[] {90, 95}).grade(),
                "average 92.5 must earn an 'A' (90+)");
        assertEquals('C', new Student("C", 2, new int[] {60, 60}).grade(),
                "average 60.0 must earn a 'C' (60+)");
        assertEquals('F', new Student("F", 3, new int[] {10, 20}).grade(),
                "average 15.0 must earn an 'F' (below 40)");
    }
}
