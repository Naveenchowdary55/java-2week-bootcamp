// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * Base class for all vehicles. This class is PROVIDED complete — you do not
 * change it. Your job is to write the subclasses ({@link Car}, {@link Bike},
 * {@link Truck}) that <b>override</b> {@link #describe()}.
 *
 * <p>Because {@code describe()} is overridable, when you call it through a
 * {@code Vehicle} reference that actually points at a {@code Car}, Java runs
 * the {@code Car} version. That runtime decision is called <b>dynamic method
 * dispatch</b> — the heart of polymorphism.
 */
public class Vehicle {

    /**
     * @return a description of this vehicle. The base version returns the
     *         generic text; each subclass replaces it with its own.
     */
    public String describe() {
        return "I am a generic vehicle";
    }
}
