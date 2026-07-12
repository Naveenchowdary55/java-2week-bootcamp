package day03;

/**
 * Day 03 exercise. See day03/README.md.
 *
 * Practise slab / tiered pricing with a chain of conditions.
 */
public class ElectricityBill {

    /**
     * Compute the bill for a number of units using slab rates:
     *   - first 100 units:            3 per unit
     *   - next 100 units (101..200):  5 per unit
     *   - next 300 units (201..500):  8 per unit
     *   - everything above 500:      10 per unit
     *
     * Only the units that fall inside a slab are charged at that slab's rate.
     *
     * Example: amount(50)  -> 150.0    (50 * 3)
     * Example: amount(150) -> 550.0    (100*3 + 50*5 = 300 + 250)
     * Example: amount(250) -> 1200.0   (100*3 + 100*5 + 50*8 = 300 + 500 + 400)
     * Example: amount(600) -> 4200.0   (100*3 + 100*5 + 300*8 + 100*10 = 300 + 500 + 2400 + 1000)
     *
     * If units < 0, throw IllegalArgumentException.
     *
     * Hint: handle each slab in turn. Figure out how many units land in each band,
     * multiply by that band's rate, and add them up.
     *
     * @param units electricity units consumed (0 or more)
     * @return the total bill
     */
    public static double amount(int units) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
