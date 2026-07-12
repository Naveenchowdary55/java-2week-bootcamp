// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * A contractor who is paid by the hour: pay = hoursWorked × hourlyRate.
 *
 * <p>Example:
 * <pre>
 *   Payable p = new Contractor(10.0, 50.0);
 *   p.calculatePay();   // 500.0
 * </pre>
 */
public class Contractor implements Payable {

    /**
     * Creates a contractor.
     *
     * @param hoursWorked hours worked
     * @param hourlyRate  pay per hour
     */
    public Contractor(double hoursWorked, double hourlyRate) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return hoursWorked × hourlyRate
     */
    @Override
    public double calculatePay() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
