import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {
    GuessNumberGame game;
    @BeforeEach
    void setUp()
    {
        game = new GuessNumberGame();
        game.incrementGuesses();
        game.decrementGuessAmountLeft();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGuesses()
    {
        int expected = 1;
        int actual = game.getGuesses();
        assertEquals(expected, actual);
    }

    @Test
    void getGuessAmountLeft()
    {
        int expected = 5;
        int actual = game.getGuessAmountLeft();
        assertEquals(expected, actual);
    }

    @Test
    void incrementGuesses()
    {
        game.incrementGuesses();
        int expected = 2;
        int actual = game.getGuesses();
        assertEquals(expected, actual);
    }

    @Test
    void decrementGuessAmountLeft()
    {
        game.decrementGuessAmountLeft();
        int expected = 4;
        int actual = game.getGuessAmountLeft();
        assertEquals(expected, actual);
    }

    @Test
    void generateRandomNumber()
    {
        int num = game.generateRandomNumber();
        assertTrue(1 <= num && num <= 20);
    }
}