package day10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PayableTest {

    @Test
    void contractorPayIsHoursTimesRate() {
        Payable p = new Contractor(10.0, 50.0);
        assertEquals(500.0, p.calculatePay(), 1e-9, "A contractor's pay is hoursWorked * hourlyRate");
    }

    @Test
    void salariedPayIsAnnualDividedByTwelve() {
        Payable p = new SalariedEmployee(120000.0);
        assertEquals(10000.0, p.calculatePay(), 1e-9, "A salaried employee's monthly pay is annualSalary / 12");
    }

    @Test
    void totalPayOverAMixedArray() {
        Payable[] people = {
                new Contractor(10.0, 50.0),   // 500
                new SalariedEmployee(120000.0) // 10000
        };
        assertEquals(10500.0, Payroll.totalPay(people), 1e-9,
                "totalPay works over the Payable type, summing each person's own pay calculation");
    }
}
