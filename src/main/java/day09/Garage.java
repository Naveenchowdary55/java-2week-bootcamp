// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A helper that describes a whole array of vehicles at once. This is where
 * polymorphism pays off: the same loop works no matter what mix of cars, bikes,
 * and trucks you hand it.
 */
public class Garage {

    /**
     * Describes every vehicle in the array.
     *
     * <p>Loop over {@code vehicles}, call {@code describe()} on each one, and
     * collect the results into a new {@code String[]} of the same length and
     * order. Java automatically calls the right subclass version of
     * {@code describe()} for each element.
     *
     * @param vehicles the vehicles to describe
     * @return a new array where element {@code i} is {@code vehicles[i].describe()}
     */
    public static String[] describeAll(Vehicle[] vehicles) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
