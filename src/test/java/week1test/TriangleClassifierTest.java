package week1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    void namesTheThreeValidShapes() {
        assertEquals("EQUILATERAL", TriangleClassifier.kind(3, 3, 3),
                "three equal sides must be EQUILATERAL");
        assertEquals("ISOSCELES", TriangleClassifier.kind(5, 5, 8),
                "exactly two equal sides must be ISOSCELES");
        assertEquals("SCALENE", TriangleClassifier.kind(3, 4, 5),
                "no two equal sides must be SCALENE");
    }

    @Test
    void argumentOrderDoesNotMatter() {
        assertEquals("ISOSCELES", TriangleClassifier.kind(8, 5, 5),
                "kind(8,5,5) is the same triangle as kind(5,5,8) — still ISOSCELES");
        assertEquals("ISOSCELES", TriangleClassifier.kind(5, 8, 5),
                "the equal pair can sit in any two of the three positions");
    }

    @Test
    void rejectsLengthsThatCannotFormATriangle() {
        assertEquals("INVALID", TriangleClassifier.kind(1, 2, 3),
                "1 + 2 is not strictly greater than 3, so this is INVALID");
        assertEquals("INVALID", TriangleClassifier.kind(1, 2, 10),
                "1 + 2 is nowhere near 10 — INVALID");
    }

    @Test
    void rejectsZeroAndNegativeSides() {
        assertEquals("INVALID", TriangleClassifier.kind(0, 0, 0),
                "zero-length sides are INVALID, not EQUILATERAL — check validity first");
        assertEquals("INVALID", TriangleClassifier.kind(-3, 4, 5),
                "a negative side is INVALID");
        assertEquals("INVALID", TriangleClassifier.kind(0, 4, 5),
                "a zero side is INVALID even when the other two are fine");
    }

    @Test
    void findsRightAngledTrianglesInAnyOrder() {
        assertTrue(TriangleClassifier.isRightAngled(3, 4, 5),
                "3-4-5 is the classic right-angled triangle");
        assertTrue(TriangleClassifier.isRightAngled(5, 3, 4),
                "the longest side is not always the last argument");
        assertTrue(TriangleClassifier.isRightAngled(5, 12, 13),
                "5-12-13 is right-angled too");
    }

    @Test
    void rejectsNonRightAngledAndInvalidTriangles() {
        assertFalse(TriangleClassifier.isRightAngled(2, 3, 4),
                "2-3-4 is a valid triangle but not a right-angled one");
        assertFalse(TriangleClassifier.isRightAngled(3, 3, 3),
                "an equilateral triangle is never right-angled");
        assertFalse(TriangleClassifier.isRightAngled(1, 2, 3),
                "an INVALID triangle must return false, not throw");
    }
}
