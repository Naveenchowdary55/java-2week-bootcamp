package day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StarPatternsTest {

    @Test
    void rightTriangleSingleRow() {
        assertEquals("*", StarPatterns.rightTriangle(1),
                "rightTriangle(1) is a single star");
    }

    @Test
    void rightTriangleThreeRows() {
        assertEquals("*\n**\n***", StarPatterns.rightTriangle(3),
                "rightTriangle(3) is:\n*\n**\n***");
    }

    @Test
    void pyramidSingleRow() {
        assertEquals("*", StarPatterns.pyramid(1),
                "pyramid(1) is a single star");
    }

    @Test
    void pyramidThreeRows() {
        assertEquals("  *\n ***\n*****", StarPatterns.pyramid(3),
                "pyramid(3) is:\n  *\n ***\n*****");
    }

    @Test
    void diamondTwoRows() {
        assertEquals(" *\n***\n *", StarPatterns.diamond(2),
                "diamond(2) is:\n *\n***\n *");
    }

    @Test
    void diamondThreeRows() {
        assertEquals("  *\n ***\n*****\n ***\n  *", StarPatterns.diamond(3),
                "diamond(3) is:\n  *\n ***\n*****\n ***\n  *");
    }
}
