package day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InterestCalculatorTest {

    @Test
    void simpleInterestUsesPrincipalRateYearsOver100() {
        assertEquals(100.0, InterestCalculator.simpleInterest(1000, 5, 2), 1e-9,
                "simpleInterest(1000, 5, 2) = 1000 * 5 * 2 / 100 = 100.0");
    }

    @Test
    void simpleInterestWorksForOneYear() {
        assertEquals(200.0, InterestCalculator.simpleInterest(2000, 10, 1), 1e-9,
                "simpleInterest(2000, 10, 1) = 2000 * 10 * 1 / 100 = 200.0");
    }

    @Test
    void totalAmountAddsInterestToPrincipal() {
        assertEquals(1100.0, InterestCalculator.totalAmount(1000, 5, 2), 1e-9,
                "totalAmount = principal 1000 + interest 100 = 1100.0");
    }
}
