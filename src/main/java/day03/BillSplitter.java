package day03;

/**
 * Day 03 exercise. See day03/README.md.
 *
 * Practise a conditional that changes a value before you use it.
 */
public class BillSplitter {

    /**
     * Work out what each person pays.
     *
     * Rule: if the total is STRICTLY greater than 2000, add a 10% tip to the total
     * first. Then divide the (possibly tipped) total equally among the people.
     *
     * Example: perPersonShare(3000, 3) -> 1100.0
     *          (3000 > 2000, so total becomes 3300; 3300 / 3 = 1100)
     * Example: perPersonShare(2000, 4) -> 500.0
     *          (2000 is NOT greater than 2000, so no tip; 2000 / 4 = 500)
     *
     * If people <= 0, or total < 0, throw IllegalArgumentException.
     *
     * Hint: "strictly greater than" means use >, not >=, so exactly 2000 gets no tip.
     *
     * @param total the bill amount before any tip
     * @param people how many people are splitting it
     * @return each person's share
     */
    public static double perPersonShare(double total, int people) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
