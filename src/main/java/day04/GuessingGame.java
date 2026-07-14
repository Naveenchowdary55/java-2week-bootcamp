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
        if (secret > guess) {
            return "one";
        } else if (secret < guess) {
            return "two";
        } else {
            return "CORRECT";
        }
    }

    public static void main(String[] args) 
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int secret = (int) (Math.random() * 100) + 1; // random number between 1 and 100
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            String result = hint(secret, guess);
            System.out.println(result);
            if (result.equals("CORRECT")) {
                System.out.println("Congratulations! You've guessed the number!");
                break;
            }
        }

        scanner.close();

       

    }
}
