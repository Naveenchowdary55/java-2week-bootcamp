package day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.Test;

class WordFrequencyTest {

    @Test
    void countsRepeatedWordsCaseInsensitively() {
        Map<String, Integer> result = WordFrequency.count("The cat and the dog.");
        assertEquals(2, result.get("the"), "'The' and 'the' should both count toward 'the' → 2");
        assertEquals(1, result.get("cat"), "'cat' appears once");
        assertEquals(1, result.get("and"), "'and' appears once");
        assertEquals(1, result.get("dog"), "'dog' appears once (the period is not part of it)");
        assertEquals(4, result.size(), "there are exactly 4 distinct words");
    }

    @Test
    void splitsOnPunctuationAndDigits() {
        Map<String, Integer> result = WordFrequency.count("wow!!! wow, wow42wow");
        // "wow42wow" splits on the digits into two more "wow"s.
        assertEquals(4, result.get("wow"),
                "letters-only words: wow / wow / wow / wow around the punctuation and digits");
        assertEquals(1, result.size(), "only one distinct word, 'wow'");
    }

    @Test
    void emptyTextGivesEmptyMap() {
        assertTrue(WordFrequency.count("").isEmpty(), "empty text → empty map");
        assertTrue(WordFrequency.count("   ").isEmpty(), "blank text → empty map");
    }

    @Test
    void nullTextGivesEmptyMap() {
        assertTrue(WordFrequency.count(null).isEmpty(), "null text → empty map, never null");
    }
}
