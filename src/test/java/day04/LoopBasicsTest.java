package day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoopBasicsTest {

    @Test
    void sumsEvensUpToTen() {
        assertEquals(30, LoopBasics.sumOfEvens(10),
                "sumOfEvens(10) must add 2+4+6+8+10 = 30");
    }

    @Test
    void sumsEvensUpToFive() {
        assertEquals(6, LoopBasics.sumOfEvens(5),
                "sumOfEvens(5) must add 2+4 = 6");
    }

    @Test
    void belowTwoIsZero() {
        assertEquals(0, LoopBasics.sumOfEvens(1),
                "sumOfEvens(1) has no evens to add, so it is 0");
    }

    @Test
    void multiplicationTableForThreeIsExact() {
        String expected =
                "3 x 1 = 3\n"
                + "3 x 2 = 6\n"
                + "3 x 3 = 9\n"
                + "3 x 4 = 12\n"
                + "3 x 5 = 15\n"
                + "3 x 6 = 18\n"
                + "3 x 7 = 21\n"
                + "3 x 8 = 24\n"
                + "3 x 9 = 27\n"
                + "3 x 10 = 30";
        assertEquals(expected, LoopBasics.multiplicationTable(3),
                "multiplicationTable(3) must be 10 lines 'n x i = result' joined by \\n, no trailing newline");
    }
}
