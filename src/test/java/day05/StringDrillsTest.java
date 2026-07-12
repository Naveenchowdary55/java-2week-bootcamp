package day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringDrillsTest {

    @Test
    void countVowelsIsCaseInsensitive() {
        assertEquals(5, StringDrills.countVowels("Education"),
                "Education has 5 vowels: E, u, a, i, o (case ignored)");
        assertEquals(0, StringDrills.countVowels("xyz"),
                "xyz has no vowels");
    }

    @Test
    void countConsonantsCountsOnlyNonVowelLetters() {
        assertEquals(7, StringDrills.countConsonants("Hello, World!"),
                "Hello, World! has 7 consonants: H l l W r l d (comma/space/! do not count)");
        assertEquals(0, StringDrills.countConsonants("aeiou 123"),
                "aeiou 123 has no consonants — vowels, spaces and digits are excluded");
    }

    @Test
    void countDigitsCountsNumbers() {
        assertEquals(3, StringDrills.countDigits("abc123"),
                "abc123 contains 3 digit characters");
        assertEquals(0, StringDrills.countDigits("no numbers here"),
                "a string with no digits must return 0");
    }

    @Test
    void countSpacesCountsPlainSpaces() {
        assertEquals(2, StringDrills.countSpaces("a b c"),
                "a b c has 2 space characters");
        assertEquals(0, StringDrills.countSpaces("nospace"),
                "nospace has 0 spaces");
    }

    @Test
    void isPalindromeIgnoresCaseButNotSpaces() {
        assertTrue(StringDrills.isPalindrome("Madam"),
                "Madam reads the same both ways when case is ignored");
        assertFalse(StringDrills.isPalindrome("Hello"),
                "Hello is not a palindrome");
        assertFalse(StringDrills.isPalindrome("Nurses Run"),
                "Nurses Run is not a palindrome here — the space is compared like any character");
    }

    @Test
    void frequencyOfIsCaseSensitive() {
        assertEquals(3, StringDrills.frequencyOf("banana", 'a'),
                "banana has 3 lowercase a's");
        assertEquals(3, StringDrills.frequencyOf("Banana", 'a'),
                "Banana still has 3 lowercase a's — the capital B is not an 'a'");
        assertEquals(1, StringDrills.frequencyOf("Banana", 'B'),
                "Banana has exactly 1 capital B (matching is case sensitive)");
    }
}
