// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * Base class for shapes. This class is PROVIDED — you do not change it. Your job
 * is to write the subclasses ({@link Circle}, {@link Rectangle},
 * {@link Triangle}) that override {@link #area()}.
 *
 * <p>Notice that the base {@code area()} returns {@code 0.0}. That's a bit of a
 * <b>design smell</b>: a plain "shape" has no meaningful area, yet here we're
 * forced to return a fake value. Tomorrow (Day 10) you'll fix this properly by
 * making {@code Shape} <b>abstract</b> so it can declare "every shape has an
 * area" without pretending to compute one.
 */
public class Shape {

    /**
     * @return the area of this shape. The base version returns {@code 0.0};
     *         each subclass overrides it with the real formula.
     */
    public double area() {
        return 0.0;
    }
}
