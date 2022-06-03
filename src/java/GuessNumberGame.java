public class GuessNumberGame {
    private int guesses = 0;
    private int guessAmountLeft = 6;

    public int getGuesses()
    {
        return this.guesses;
    }

    public int getGuessAmountLeft()
    {
        return this.guessAmountLeft;
    }

    public void incrementGuesses()
    {
        this.guesses++;
    }

    public void decrementGuessAmountLeft()
    {
        this.guessAmountLeft--;
    }

    public int generateRandomNumber()
    {
        int number = (int)Math.floor(Math.random()*(21 - 1)+1);
        return number;
    }
}
