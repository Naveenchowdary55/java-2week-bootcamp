package day04;

/**
 * Day 04 exercise. See day04/README.md.
 *
 * Nested loops that draw shapes. Every method returns the shape as ONE String,
 * with rows joined by '\n' and NO trailing newline.
 */
public class StarPatterns {

    /**
     * A left-aligned right triangle: row i has i stars.
     *
     * rightTriangle(1) is:
     *   *
     *
     * rightTriangle(3) is:
     *   *
     *   **
     *   ***
     *
     * Hint: outer loop picks the row (1..rows); inner loop prints that many stars.
     *
     * @param rows number of rows
     * @return the triangle as one String
     */
    public static String rightTriangle(int rows) {
        
        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                triangle.append("*");
            }

            if (i != rows) {
                triangle.append("\n");
            }
        }

        return triangle.toString();
    }


    /**
     * A centred pyramid. Row i (1-based) has (rows - i) leading spaces, then
     * (2*i - 1) stars, and NO trailing spaces.
     *
     * pyramid(1) is:
     *   *
     *
     * pyramid(3) is:
     *     *
     *    ***
     *   *****
     * (that is "  *", " ***", "*****")
     *
     * Hint: two inner loops per row — one for the spaces, one for the stars.
     *
     * @param rows number of rows
     * @return the pyramid as one String
     */
    public static String pyramid(int rows) {
        StringBuilder pyramid = new StringBuilder();

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                pyramid.append(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                pyramid.append("*");
            }
            // Add newline (except for the last row)
            if (i != rows) {
                pyramid.append("\n");
            }
        }

        return pyramid.toString();
    }

    /**
     * A diamond: a pyramid(rows), then the pyramid's first (rows - 1) lines again in
     * reverse order. Total lines = 2*rows - 1.
     *
     * diamond(2) is:
     *    *
     *   ***
     *    *
     * (that is " *", "***", " *")
     *
     * diamond(3) is:
     *     *
     *    ***
     *   *****
     *    ***
     *     *
     *
     * Hint: build pyramid(rows), split it into its lines, then append lines
     * rows-2, rows-3, ... 0 back on in reverse.
     *
     * @param rows number of rows in the top half
     * @return the diamond as one String
     */
    public static String diamond(int rows) {
        String pyramid = pyramid(rows);
        String[] lines = pyramid.split("\n");
        StringBuilder diamond = new StringBuilder(pyramid);

        for (int i = lines.length - 2; i >= 0; i--) {
            diamond.append("\n").append(lines[i]);
        }

        return diamond.toString();
    }
}
