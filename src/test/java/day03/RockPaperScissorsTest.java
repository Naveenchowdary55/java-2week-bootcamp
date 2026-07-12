package day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

    @Test
    void rockBeatsScissors() {
        assertEquals("PLAYER 1", RockPaperScissors.winner("rock", "scissors"),
                "rock beats scissors, so player 1 wins");
    }

    @Test
    void scissorsBeatsPaperForPlayerTwo() {
        assertEquals("PLAYER 2", RockPaperScissors.winner("paper", "scissors"),
                "scissors beats paper, so player 2 wins");
    }

    @Test
    void sameMoveIsADraw() {
        assertEquals("DRAW", RockPaperScissors.winner("rock", "rock"),
                "identical moves are a DRAW");
    }

    @Test
    void inputIsCaseInsensitive() {
        assertEquals("PLAYER 1", RockPaperScissors.winner("PAPER", "Rock"),
                "paper beats rock regardless of letter case");
    }

    @Test
    void unknownMoveThrows() {
        assertThrows(IllegalArgumentException.class,
                () -> RockPaperScissors.winner("rock", "banana"),
                "an invalid move must throw IllegalArgumentException");
    }
}
