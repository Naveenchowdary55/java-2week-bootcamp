package day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GradeAssignerTest {

    // Boundary marks and the grade each should produce.
    private static final int[] MARKS = {100, 90, 89, 75, 74, 60, 59, 40, 39, 0};
    private static final char[] GRADES = {'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'F', 'F'};

    @Test
    void ifElseMatchesTheScaleAtEveryBoundary() {
        for (int i = 0; i < MARKS.length; i++) {
            assertEquals(GRADES[i], GradeAssigner.gradeIfElse(MARKS[i]),
                    "gradeIfElse(" + MARKS[i] + ") should be " + GRADES[i]);
        }
    }

    @Test
    void allThreeMethodsAgreeAtEveryBoundary() {
        for (int m : MARKS) {
            char ie = GradeAssigner.gradeIfElse(m);
            char te = GradeAssigner.gradeTernary(m);
            char sw = GradeAssigner.gradeSwitch(m);
            assertEquals(ie, te, "gradeTernary(" + m + ") must match gradeIfElse(" + m + ")");
            assertEquals(ie, sw, "gradeSwitch(" + m + ") must match gradeIfElse(" + m + ")");
        }
    }

    @Test
    void marksAbove100Throw() {
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeIfElse(101),
                "101 is out of range and must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeTernary(101),
                "101 is out of range and must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeSwitch(101),
                "101 is out of range and must throw IllegalArgumentException");
    }

    @Test
    void negativeMarksThrow() {
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeIfElse(-1),
                "-1 is out of range and must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeTernary(-1),
                "-1 is out of range and must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> GradeAssigner.gradeSwitch(-1),
                "-1 is out of range and must throw IllegalArgumentException");
    }
}
