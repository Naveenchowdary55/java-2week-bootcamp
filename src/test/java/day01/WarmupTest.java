package day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WarmupTest {

    @Test
    void greetingWelcomesTheNamedPerson() {
        assertEquals("Hello, Asha! Welcome to Java.", Warmup.greeting("Asha"),
                "greeting(\"Asha\") must be exactly \"Hello, Asha! Welcome to Java.\"");
    }

    @Test
    void greetingWorksForAnyName() {
        assertEquals("Hello, Ravi! Welcome to Java.", Warmup.greeting("Ravi"),
                "greeting must plug the name into the same sentence for everyone");
    }

    @Test
    void starLineProducesTheRightNumberOfStars() {
        assertEquals("***", Warmup.starLine(3),
                "starLine(3) must be three asterisks");
        assertEquals("*", Warmup.starLine(1),
                "starLine(1) must be a single asterisk");
    }

    @Test
    void starLineOfZeroIsEmpty() {
        assertEquals("", Warmup.starLine(0),
                "starLine(0) must be the empty string, not null and not a space");
    }
}
