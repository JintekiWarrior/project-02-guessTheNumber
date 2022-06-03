import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {
    GuessNumberGame game;
    @BeforeEach
    void setUp()
    {
        game = new GuessNumberGame("Moe");
        game.incrementGuesses();
        game.decrementGuessAmountLeft();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getPlayerName()
    {
        String expected = "Moe";
        String actual = game.getPlayerName();
        assertEquals(expected, actual);
    }

    // Tests both getter and setter for player test
    @Test
    void getPlayerGuess()
    {
        game.setPlayerGuess(10);
        int expected = 10;
        int actual = game.getPlayerGuess();
        assertEquals(expected, actual);
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
    void getRandomNumber()
    {
        int randNum = game.getRandomNumber();
        assertTrue(1 <= randNum && randNum <= 20);
    }

//    @Test
//    void generateRandomNumber()
//    {
//        int num = game.generateRandomNumber();
//        assertTrue(1 <= num && num <= 20);
//    }

}