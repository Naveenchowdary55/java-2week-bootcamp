package day03;

/**
 * Day 03 exercise. See day03/README.md.
 *
 * Same grading rule, written THREE different ways, so you feel how if/else,
 * the ternary operator, and switch each express the same logic.
 *
 * Grade scale (marks are 0..100 inclusive):
 *   90..100 -> 'A'
 *   75..89  -> 'B'
 *   60..74  -> 'C'
 *   40..59  -> 'D'
 *   0..39   -> 'F'
 * Any marks outside 0..100 must throw IllegalArgumentException.
 */
public class GradeAssigner {

    /**
     * Grade using an if / else-if chain (required construct).
     *
     * Example: gradeIfElse(95) -> 'A'
     * Example: gradeIfElse(72) -> 'C'
     * Example: gradeIfElse(150) -> throws IllegalArgumentException
     *
     * Hint: check the invalid range first, then order your branches from A down to F.
     *
     * @param marks a score between 0 and 100
     * @return the grade letter
     */
    public static char gradeIfElse(int marks) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Grade using ONLY the ternary operator (the ? : chain) — no if/switch.
     *
     * Example: gradeTernary(89) -> 'B'
     * Example: gradeTernary(40) -> 'D'
     *
     * Hint: it reads like
     *   return (marks >= 90) ? 'A' : (marks >= 75) ? 'B' : ... ;
     * You still need to throw for invalid marks first.
     *
     * @param marks a score between 0 and 100
     * @return the grade letter
     */
    public static char gradeTernary(int marks) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Grade using a switch statement (required construct).
     *
     * Example: gradeSwitch(60) -> 'C'
     * Example: gradeSwitch(0)  -> 'F'
     *
     * Hint: you cannot switch on 100 different values easily, but you CAN switch on
     * marks / 10, which is 0..10. Group the buckets: 10 and 9 -> 'A', 8 and 7 -> 'B',
     * 6 -> 'C', 5 and 4 -> 'D', and everything below -> 'F'. Watch the 75 and 74 edges!
     *
     * @param marks a score between 0 and 100
     * @return the grade letter
     */
    public static char gradeSwitch(int marks) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
