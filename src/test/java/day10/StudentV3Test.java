package day10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentV3Test {

    @Test
    void toStringHasExactFormat() {
        StudentV3 s = new StudentV3("Asha", 12);
        assertEquals("Student{name=Asha, rollNo=12}", s.toString(),
                "toString() must match the exact format; System.out.println(student) calls this automatically");
    }

    @Test
    void toStringReflectsDifferentValues() {
        StudentV3 s = new StudentV3("Ben", 7);
        assertEquals("Student{name=Ben, rollNo=7}", s.toString(),
                "toString() should build the text from the student's own name and rollNo");
    }

    @Test
    void gettersReturnConstructorValues() {
        StudentV3 s = new StudentV3("Cara", 21);
        assertEquals("Cara", s.getName(), "getName() should return the constructor name");
        assertEquals(21, s.getRollNo(), "getRollNo() should return the constructor roll number");
    }
}
