// Day 12 exercise — see src/main/java/day12/README.md
package day12;

import java.util.Map;

/**
 * Counts how many times each word appears in a piece of text. This is the
 * "hello world" of {@link java.util.HashMap}: the key is the word, the value is
 * a running count.
 */
public class WordFrequency {

    /**
     * Counts word frequencies in {@code text}.
     *
     * <p>Rules:
     * <ul>
     *   <li>A "word" is a maximal run of LETTERS. Split on anything that is not a
     *       letter (spaces, digits, punctuation).</li>
     *   <li>Compare case-insensitively: lowercase everything first, so "The" and
     *       "the" count as the same word.</li>
     *   <li>Null, empty, or blank text → return an empty map (not null).</li>
     * </ul>
     *
     * <p>Example:
     * <pre>
     *   count("The cat and the dog.")  →  {the=2, cat=1, and=1, dog=1}
     * </pre>
     *
     * <p>Hint: {@code text.toLowerCase().split("[^a-z]+")} gives you the words.
     * Watch out — splitting a string that starts with a non-letter can hand you a
     * leading empty string {@code ""}; skip empties. For each word, the pattern
     * {@code map.put(w, map.getOrDefault(w, 0) + 1)} bumps the count.
     *
     * @param text any text (may be null or blank)
     * @return a map from each lowercase word to its count
     */
    public static Map<String, Integer> count(String text) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
