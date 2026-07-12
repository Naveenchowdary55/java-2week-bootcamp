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
        throw new UnsupportedOperationException("TODO: implement me");
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
        // TODO (interactive, not tested): build a game against the computer.
        //   1. Create a Scanner to read the player's move from the keyboard.
        //   2. Call randomMove() for the computer's move.
        //   3. Print both moves, then print winner(playerMove, computerMove).
        //   4. Bonus: loop for 3 rounds and keep score.
    }
}
