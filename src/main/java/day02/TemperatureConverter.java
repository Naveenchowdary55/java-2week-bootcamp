package day02;

/**
 * Day 02 exercise. See day02/README.md.
 *
 * Practise the order of operations with doubles. Replace each
 * `throw new UnsupportedOperationException(...)` with real code.
 */
public class TemperatureConverter {

    /**
     * Convert Celsius to Fahrenheit:  f = c * 9 / 5 + 32.
     *
     * Example: celsiusToFahrenheit(0)   -> 32.0
     * Example: celsiusToFahrenheit(100) -> 212.0
     *
     * Hint: because c is a double, c * 9 / 5 keeps the decimals (no integer division here).
     *
     * @param c temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double celsiusToFahrenheit(double c) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Convert Fahrenheit to Celsius:  c = (f - 32) * 5 / 9.
     *
     * Example: fahrenheitToCelsius(32)  -> 0.0
     * Example: fahrenheitToCelsius(212) -> 100.0
     *
     * Hint: subtract 32 FIRST, so wrap (f - 32) in parentheses.
     *
     * @param f temperature in Fahrenheit
     * @return temperature in Celsius
     */
    public static double fahrenheitToCelsius(double f) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
