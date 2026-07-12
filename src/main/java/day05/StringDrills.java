package day05;

/**
 * Day 05 — walking through Strings character by character. See day05/README.md.
 *
 * A String is a sequence of characters. You can read its length with s.length()
 * and the character at position i with s.charAt(i). Loop from 0 up to
 * s.length() - 1 to visit each character.
 *
 * Replace each `throw new UnsupportedOperationException(...)` with real code.
 */
public class StringDrills {

    /**
     * Count the vowels (a, e, i, o, u), ignoring case.
     *
     * Example: countVowels("Education") -> 5   (E, u, a, i, o)
     * Example: countVowels("xyz")       -> 0
     *
     * Hint: lowercase the character (Character.toLowerCase(c)) then check whether
     * it equals 'a', 'e', 'i', 'o', or 'u'.
     *
     * @param s the text to scan (never null)
     * @return how many vowels appear
     */
    public static int countVowels(String s) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Count the consonants: letters (a–z, A–Z) that are NOT vowels.
     *
     * Digits, spaces, and punctuation do not count.
     * Example: countConsonants("Hello, World!") -> 7   (H l l W r l d)
     * Example: countConsonants("aeiou 123")     -> 0
     *
     * Hint: Character.isLetter(c) tells you it is a letter; then it is a
     * consonant only if it is not one of the five vowels.
     *
     * @param s the text to scan (never null)
     * @return how many consonants appear
     */
    public static int countConsonants(String s) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Count the digit characters (0–9).
     *
     * Example: countDigits("abc123") -> 3
     * Example: countDigits("no numbers here") -> 0
     *
     * Hint: Character.isDigit(c) does the check for you.
     *
     * @param s the text to scan (never null)
     * @return how many digit characters appear
     */
    public static int countDigits(String s) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Count the space characters — the plain ' ' space only (not tabs, newlines).
     *
     * Example: countSpaces("a b c")  -> 2
     * Example: countSpaces("nospace") -> 0
     *
     * Hint: compare each character against the space literal ' '.
     *
     * @param s the text to scan (never null)
     * @return how many ' ' characters appear
     */
    public static int countSpaces(String s) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Is the text the same read forwards and backwards, ignoring case only?
     *
     * Keep it simple: we compare characters exactly as they are, apart from case.
     * Spaces and punctuation still count as characters.
     * Example: isPalindrome("Madam")      -> true
     * Example: isPalindrome("Hello")      -> false
     * Example: isPalindrome("Nurses Run") -> false  (the space breaks the mirror)
     *
     * Hint: two cursors again — one at the front, one at the back. Lowercase both
     * characters and compare. If any pair differs, it is not a palindrome. If the
     * cursors cross without a mismatch, it is.
     *
     * @param s the text to check (never null)
     * @return true if it reads the same both ways (ignoring case)
     */
    public static boolean isPalindrome(String s) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Count how many times a specific character appears — case SENSITIVE this
     * time, so 'a' and 'A' are treated as different.
     *
     * Example: frequencyOf("banana", 'a') -> 3
     * Example: frequencyOf("Banana", 'a') -> 3   (the capital 'B' is not an 'a')
     * Example: frequencyOf("Banana", 'B') -> 1
     *
     * Hint: walk the String and add 1 each time charAt(i) == target. No
     * lowercasing here — we want an exact match.
     *
     * @param s      the text to scan (never null)
     * @param target the character to count
     * @return how many times target appears exactly
     */
    public static int frequencyOf(String s, char target) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
