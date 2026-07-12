package day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentV2Test {

    @Test
    void twoArgConstructorLeavesEmptyMarks() {
        StudentV2 s = new StudentV2("Asha", 12);
        assertEquals(0.0, s.average(), 1e-9,
                "A student created without marks should have an average of 0.0");
    }

    @Test
    void storesNameAndRollNo() {
        StudentV2 s = new StudentV2("Ben", 13);
        assertEquals("Ben", s.getName(), "getName() should return the constructor name");
        assertEquals(13, s.getRollNo(), "getRollNo() should return the constructor roll number");
    }

    @Test
    void averageOfMarks() {
        StudentV2 s = new StudentV2("Cara", 14, new int[]{80, 90, 100});
        assertEquals(90.0, s.average(), 1e-9, "Average of 80, 90, 100 should be 90.0");
    }

    @Test
    void threeArgConstructorAlsoStoresBasics() {
        StudentV2 s = new StudentV2("Dev", 15, new int[]{50});
        assertEquals("Dev", s.getName(), "Name should be stored via the three-argument constructor too");
        assertEquals(15, s.getRollNo(), "Roll number should be stored via the three-argument constructor too");
    }
}
