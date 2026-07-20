package week1test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TextStatsTest {

    @Test
    void countsVowelsInBothCases() {
        assertEquals(5, TextStats.countVowels("Education"),
                "Education has 5 vowels: E, u, a, i, o — capitals count too");
        assertEquals(0, TextStats.countVowels("rhythm"),
                "rhythm has no vowels — y does not count");
        assertEquals(5, TextStats.countVowels("A E i o U"),
                "spaces are skipped, not counted or rejected");
    }

    @Test
    void countsVowelsInEmptyAndPunctuatedText() {
        assertEquals(0, TextStats.countVowels(""),
                "the empty String has 0 vowels — it is valid input, not an error");
        assertEquals(3, TextStats.countVowels("h3ll0, w0rld! aei"),
                "digits and punctuation are skipped; only a, e, i are vowels here");
    }

    @Test
    void reversesText() {
        assertEquals("olleh", TextStats.reverse("hello"),
                "hello backwards is olleh");
        assertEquals("a", TextStats.reverse("a"),
                "a single character is its own reverse");
        assertEquals("", TextStats.reverse(""),
                "the empty String reverses to the empty String");
        assertEquals("cba EDF", TextStats.reverse("FDE abc"),
                "spaces and case are preserved exactly, just reordered");
    }

    @Test
    void spotsPalindromesIgnoringCaseAndPunctuation() {
        assertTrue(TextStats.isPalindrome("Race car"),
                "\"Race car\" is a palindrome once case and the space are ignored");
        assertTrue(TextStats.isPalindrome("A man, a plan, a canal: Panama"),
                "the classic — ignore every space, comma and colon");
        assertTrue(TextStats.isPalindrome("ab1ba"),
                "digits take part in the comparison, they are not skipped");
    }

    @Test
    void treatsTextWithNoLettersOrDigitsAsAPalindrome() {
        assertTrue(TextStats.isPalindrome(""),
                "the empty String is a palindrome — nothing contradicts it");
        assertTrue(TextStats.isPalindrome("!!!"),
                "with every character ignored there is nothing left to mismatch");
    }

    @Test
    void rejectsNonPalindromes() {
        assertFalse(TextStats.isPalindrome("hello"),
                "hello is not a palindrome");
        assertFalse(TextStats.isPalindrome("ab"),
                "two different characters are not a palindrome");
        assertFalse(TextStats.isPalindrome("ab, ba!c"),
                "abbac is not a palindrome once punctuation is stripped");
    }

    @Test
    void everyMethodRejectsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> TextStats.countVowels(null),
                "countVowels(null) must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> TextStats.reverse(null),
                "reverse(null) must throw IllegalArgumentException");
        assertThrows(IllegalArgumentException.class,
                () -> TextStats.isPalindrome(null),
                "isPalindrome(null) must throw IllegalArgumentException");
    }
}
