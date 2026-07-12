// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * An <b>abstract</b> shape. This is the fix for yesterday's design smell: a
 * generic shape has no real area, so instead of faking a {@code 0.0}, we simply
 * <b>declare</b> that every shape must have an area and refuse to compute one
 * here.
 *
 * <p>This class is PROVIDED — the {@code abstract} declaration, the abstract
 * {@code area()} method, and the concrete {@code describe()} method are all done
 * for you. You write the subclasses {@link Circle} and {@link Rectangle}.
 *
 * <p>Because {@code Shape} is abstract you cannot write {@code new Shape()} — try
 * it and read the compiler error (see the warm-up). But it can still hold
 * shared, concrete behaviour like {@link #describe()} that works for every
 * subclass.
 */
public abstract class Shape {

    /**
     * Every concrete shape must supply its own area. There is no body here — the
     * subclass is required to provide one.
     *
     * @return the shape's area
     */
    public abstract double area();

    /**
     * A concrete method shared by all shapes. Notice it calls the abstract
     * {@code area()} — at run time that resolves to the subclass's version.
     *
     * @return e.g. {@code "Rectangle with area 6.0"}
     */
    public String describe() {
        return getClass().getSimpleName() + " with area " + area();
    }
}
