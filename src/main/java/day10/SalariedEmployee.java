// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * A salaried employee paid a fixed annual salary, split monthly:
 * pay = annualSalary / 12.
 *
 * <p>Example:
 * <pre>
 *   Payable p = new SalariedEmployee(120000.0);
 *   p.calculatePay();   // 10000.0
 * </pre>
 */
public class SalariedEmployee implements Payable {

    /**
     * Creates a salaried employee.
     *
     * @param annualSalary the yearly salary
     */
    public SalariedEmployee(double annualSalary) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return annualSalary / 12
     */
    @Override
    public double calculatePay() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
