package day04;

/**
 * Day 04 exercise. See day04/README.md.
 *
 * The testable core is hint(). The interactive game in main() is for you to build
 * (not tested).
 */
public class GuessingGame {

    /**
     * Tell the player how their guess compares to the secret number.
     *
     * Returns:
     *   "HIGHER"  if the secret is greater than the guess (aim higher),
     *   "LOWER"   if the secret is less than the guess (aim lower),
     *   "CORRECT" if they match.
     *
     * Example: hint(50, 30) -> "HIGHER"   (secret 50 is above guess 30)
     * Example: hint(50, 80) -> "LOWER"
     * Example: hint(50, 50) -> "CORRECT"
     *
     * Hint: compare secret and guess with > and <.
     *
     * @param secret the number the player is trying to find
     * @param guess the player's current guess
     * @return "HIGHER", "LOWER", or "CORRECT"
     */
    public static String hint(int secret, int guess) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    public static void main(String[] args) {
        // TODO (interactive, not tested): build the full guessing game.
        //   1. Pick a secret: int secret = 1 + (int) (Math.random() * 100);  // 1..100
        //   2. Create a Scanner to read the player's guesses.
        //   3. Loop: read a guess, print hint(secret, guess), count attempts.
        //   4. Stop when hint(...) is "CORRECT", then print how many attempts it took.
    }
}
