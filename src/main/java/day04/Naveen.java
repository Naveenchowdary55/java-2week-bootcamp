public class Naveen.GuessingGame {

    public static String hint(int secret, int guess) {

        if (secret > guess) {
            return "HIGHER";
        } else if (secret < guess) {
            return "LOWER";
        } else {
            return "CORRECT";
        }
    }

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Random number between 40 and 80
        int secret = 50;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
    
        while (true) {

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            String result = hint(secret, guess);

            if (result.equals("HIGHER")) {
                System.out.println("Hint: Guess a HIGHER number.");
            } else if (result.equals("LOWER")) {
                System.out.println("Hint: Guess a LOWER number.");
            } else {
                System.out.println("CORRECT!");
                System.out.println("Congratulations!  NAVEEN You guessed the correct number.");
                break;
            }
        }

        scanner.close();
    }
}
