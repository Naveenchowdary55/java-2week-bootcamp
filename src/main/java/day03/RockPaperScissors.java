package day03;

/**
 * Day 03 exercise. See day03/README.md.
 *
 * Practise comparing Strings and handling bad input. The randomMove() and main
 * pieces are for the interactive game you build (not tested) — focus on winner().
 */
public class RockPaperScissors {

    /**
     * Decide the winner of one round.
     *
     * Inputs are case-insensitive and must be one of "rock", "paper", "scissors"
     * (so "ROCK", "Rock" and "rock" all count as rock).
     *
     * Returns:
     *   "PLAYER 1" if p1 beats p2,
     *   "PLAYER 2" if p2 beats p1,
     *   "DRAW"     if they chose the same move.
     *
     * Classic rules: rock beats scissors, scissors beats paper, paper beats rock.
     *
     * Example: winner("rock", "scissors") -> "PLAYER 1"
     * Example: winner("PAPER", "scissors") -> "PLAYER 2"
     * Example: winner("rock", "rock") -> "DRAW"
     * Example: winner("rock", "banana") -> throws IllegalArgumentException
     *
     * Hint: lowercase both inputs first with .toLowerCase(), then compare with .equals().
     * Never compare Strings with == in Java.
     *
     * @param p1 player one's move
     * @param p2 player two's move
     * @return "PLAYER 1", "PLAYER 2", or "DRAW"
     */
    public static String winner(String p1, String p2) {
        p1 = p1.toLowerCase();
        p2 = p2.toLowerCase();


        if (!isValidMove(p1) || !isValidMove(p2)) {
            throw new IllegalArgumentException("Invalid move: " + p1 + " or " + p2);
        }

        if (p1.equals(p2)) {
            return "DRAW";
        } else if ((p1.equals("rock") && p2.equals("scissors")) ||
                   (p1.equals("scissors") && p2.equals("paper")) ||
                   (p1.equals("paper") && p2.equals("rock"))) {
            return "PLAYER 1";
        } else {
            return "PLAYER 2";
        }
    }

    /**
     * Returns a random move — "rock", "paper", or "scissors".
     * Provided for you; used by your interactive game against the computer.
     *
     * @return a random valid move
     */
    public static String randomMove() {
        int roll = (int) (Math.random() * 3); // 0, 1, or 2
        if (roll == 0) {
            return "rock";
        } else if (roll == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static void main(String[] args) {
        // play a game against the computer
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your move (rock, paper, scissors): ");
        String playerMove = scanner.nextLine();
        String computerMove = randomMove();
        System.out.println("Computer chose: " + computerMove);
        String result = winner(playerMove, computerMove);
        System.out.println("Result: " + result);

       
    }
}
