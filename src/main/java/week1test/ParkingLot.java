package week1test;

/**
 * Week 1 Test — Problem 5 of 5 (MEDIUM, 20 marks).
 *
 * Topics: classes, fields, constructors, constructor overloading, an array held
 * as object state, validation.
 *
 * This is the only problem where the object REMEMBERS things between calls. Two
 * different ParkingLot objects must not share anything — park a car in one and
 * the other must still be empty.
 *
 * You must declare your own fields; the stub deliberately has none. Hold the
 * parked plates in a String[] sized to the lot's capacity, and scan it with
 * loops. No ArrayList, no HashMap, no HashSet.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class ParkingLot {

    /**
     * A default lot with room for 10 cars.
     *
     * Write this as ONE line that hands the work to the other constructor —
     * `this(10);` — rather than repeating the setup. That is constructor
     * chaining, and it is the point of this method.
     */
    public ParkingLot() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * A lot with room for exactly {@code capacity} cars.
     *
     * A lot with no spaces makes no sense, so reject a capacity below 1.
     *
     * @param capacity how many cars fit, 1 or more
     * @throws IllegalArgumentException if capacity is less than 1
     */
    public ParkingLot(int capacity) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Park a car.
     *
     * Number plates are matched IGNORING CASE — "ka01ab1234" and "KA01AB1234"
     * are the same car. Store whatever the caller gave you; just compare
     * case-insensitively.
     *
     * Return false (do not throw) when the car cannot be parked because:
     *   - the lot is full, or
     *   - that plate is already parked.
     * Return true when the car was parked.
     *
     * A null or blank plate is a programming error, not a full lot — reject it.
     * "Blank" means empty or nothing but whitespace.
     *
     * @param plate the number plate
     * @return true if the car was parked, false if the lot was full or the car
     *         was already in it
     * @throws IllegalArgumentException if plate is null or blank
     */
    public boolean park(String plate) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Remove a car from the lot, freeing its space for someone else.
     *
     * Matches the plate ignoring case, like {@link #park(String)}.
     *
     * @param plate the number plate
     * @return true if that car was in the lot and has now left, false if it was
     *         never there
     * @throws IllegalArgumentException if plate is null or blank
     */
    public boolean leave(String plate) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Is this car currently in the lot? Matches ignoring case.
     *
     * @param plate the number plate
     * @return true if the car is parked here right now
     * @throws IllegalArgumentException if plate is null or blank
     */
    public boolean isParked(String plate) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return how many cars are parked right now
     */
    public int occupied() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return how many spaces are still free right now
     */
    public int availableSpaces() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return the total number of spaces this lot was built with
     */
    public int capacity() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
