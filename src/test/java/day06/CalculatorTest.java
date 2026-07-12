package day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addsTwoIntegers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3),
                "add(2, 3) must return 5");
    }

    @Test
    void addsThreeIntegers() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.add(1, 2, 3),
                "the three-argument add(1, 2, 3) must return 6");
    }

    @Test
    void addsTwoDoubles() {
        Calculator calc = new Calculator();
        assertEquals(3.0, calc.add(2.5, 0.5), 1e-9,
                "the double add(2.5, 0.5) must return 3.0");
    }

    @Test
    void overloadsPickTheRightMethodByArgumentType() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4),
                "two ints must use the int version and return an int 7");
        assertEquals(7.5, calc.add(3.0, 4.5), 1e-9,
                "two doubles must use the double version and return 7.5");
    }
}
