package day06;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class MatrixMathTest {

    @Test
    void addsTwoMatricesElementWise() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] expected = {{6, 8}, {10, 12}};
        assertArrayEquals(expected, MatrixMath.add(a, b),
                "each cell of the result must be the sum of the matching cells");
    }

    @Test
    void addsNonSquareMatrices() {
        int[][] a = {{1, 2, 3}};
        int[][] b = {{10, 20, 30}};
        int[][] expected = {{11, 22, 33}};
        assertArrayEquals(expected, MatrixMath.add(a, b),
                "a 1x3 plus a 1x3 must give a 1x3 of element-wise sums");
    }

    @Test
    void doesNotModifyTheInputMatrices() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        MatrixMath.add(a, b);
        assertArrayEquals(new int[][] {{1, 2}, {3, 4}}, a,
                "add must build a NEW matrix and leave the first input untouched");
        assertArrayEquals(new int[][] {{5, 6}, {7, 8}}, b,
                "add must leave the second input untouched too");
    }

    @Test
    void mismatchedDimensionsAreRejected() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        assertThrows(IllegalArgumentException.class,
                () -> MatrixMath.add(a, b),
                "adding matrices of different shapes must throw IllegalArgumentException");
    }
}
