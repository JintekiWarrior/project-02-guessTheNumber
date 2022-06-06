public class GuessNumberGame {
    private String playerName;
    private int playerGuess;
    private int guesses = 0;
    private int guessAmountLeft = 6;
    private int randomNumber;

    GuessNumberGame(String name)
    {
        this.playerName = name;
        this.randomNumber = (int)Math.floor(Math.random()*(21 - 1)+1);
    }

    public String getPlayerName()
    {
        return this.playerName;
    }

    public int getPlayerGuess()
    {
        return this.playerGuess;
    }

    public int getGuesses()
    {
        return this.guesses;
    }

    // Player has a finite amount of guesses
    public int getGuessAmountLeft()
    {
        return this.guessAmountLeft;
    }

    public int getRandomNumber()
    {
        return this.randomNumber;
    }

    // Check to match the player guess against the random number generated
    public boolean checkPlayerGuess(int guess)
    {
        if (guess < 1 || guess > 20)
        {
            System.out.println("Not a valid guess");
            return false;
        } else if (guess < this.randomNumber)
        {
            System.out.println("You guessed too low");
            return false;
        } else if ( guess > this.randomNumber)
        {
            System.out.println("You guessed too high");
            return false;
        } else if (guess == this.randomNumber)
        {
            System.out.println("Congrats you guessed it!");
            return true;
        } else
        {
            System.out.println("You have an error");
            return false;
        }
    }

    public void setPlayerGuess(int guess)
    {
        this.playerGuess = guess;
    }

    public void incrementGuesses()
    {
        this.guesses++;
    }

    public void decrementGuessAmountLeft()
    {
        this.guessAmountLeft--;
    }

}
