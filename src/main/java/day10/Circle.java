// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * A circle. Because {@link Shape} is abstract and requires an {@code area()},
 * you MUST implement it here — the class won't compile otherwise.
 *
 * <p>Its area is π × radius².
 */
public class Circle extends Shape {

    /**
     * Creates a circle with the given radius.
     *
     * @param radius the circle's radius
     */
    public Circle(double radius) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return π × radius² — use {@link Math#PI}
     */
    @Override
    public double area() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
