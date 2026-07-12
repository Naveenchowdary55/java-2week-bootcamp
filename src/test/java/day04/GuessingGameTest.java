package day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GuessingGameTest {

    @Test
    void guessTooLowSaysHigher() {
        assertEquals("HIGHER", GuessingGame.hint(50, 30),
                "secret 50 is above guess 30, so aim HIGHER");
    }

    @Test
    void guessTooHighSaysLower() {
        assertEquals("LOWER", GuessingGame.hint(50, 80),
                "secret 50 is below guess 80, so aim LOWER");
    }

    @Test
    void exactGuessSaysCorrect() {
        assertEquals("CORRECT", GuessingGame.hint(50, 50),
                "matching guess is CORRECT");
    }
}
