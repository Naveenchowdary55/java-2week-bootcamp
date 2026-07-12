// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A {@link Vehicle} that is a car. Override {@link #describe()} so that calling
 * it returns exactly {@code "I am a car"}.
 *
 * <p>Hint: use the {@code @Override} annotation — it makes the compiler check
 * that you really are overriding a method from the parent, catching typos in
 * the method name.
 */
public class Car extends Vehicle {

    /**
     * @return exactly {@code "I am a car"}
     */
    @Override
    public String describe() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
