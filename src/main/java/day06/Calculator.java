package day06;

/**
 * Day 06 — your first real object, plus method overloading. See day06/README.md.
 *
 * These are INSTANCE methods (no `static`), so to use them you first make an
 * object:  Calculator calc = new Calculator();  then calc.add(2, 3).
 *
 * All three methods are named `add`. That is legal and useful — it is called
 * "overloading". Java tells them apart by the number and TYPE of the arguments.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class Calculator {

    /**
     * Add two whole numbers.
     *
     * Example: new Calculator().add(2, 3) -> 5
     *
     * @param a first number
     * @param b second number
     * @return a + b
     */
    public int add(int a, int b) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Add three whole numbers. Same name, different argument count — Java picks
     * this version when you pass three ints.
     *
     * Example: new Calculator().add(1, 2, 3) -> 6
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return a + b + c
     */
    public int add(int a, int b, int c) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Add two decimal numbers. Same name again — Java picks this version when you
     * pass doubles instead of ints.
     *
     * Example: new Calculator().add(2.5, 0.5) -> 3.0
     *
     * @param a first number
     * @param b second number
     * @return a + b
     */
    public double add(double a, double b) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
