package day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    @Test
    void freezingPointConvertsToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 1e-9,
                "0C is 32F");
    }

    @Test
    void boilingPointConvertsToFahrenheit() {
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 1e-9,
                "100C is 212F");
    }

    @Test
    void freezingPointConvertsToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 1e-9,
                "32F is 0C");
    }

    @Test
    void boilingPointConvertsToCelsius() {
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 1e-9,
                "212F is 100C");
    }
}
