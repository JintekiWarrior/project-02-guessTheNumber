import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner gameScanner = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("What is your name?");
        String name = gameScanner.nextLine();

        while (playAgain)
        {
            GuessNumberGame game = new GuessNumberGame(name);
            System.out.println("Hello " + game.getPlayerName() + " Guess a number between 1 and 20.");
            for (int i = game.getGuessAmountLeft(); i > 0; i--)
            {
                int guess = gameScanner.nextInt();
                boolean check = game.checkPlayerGuess(guess);
                if (check)
                {
                    break;
                }
            }
            // reset scanner
            gameScanner.nextLine();

            System.out.println("Would you like to play again? (y or n)");
            char yes = 'y';
            char playerResponse = gameScanner.next().charAt(0);

            // if player types anything but y the game closes
            if (playerResponse != yes)
            {
                System.out.println("Goodbye");
                playAgain = false;
            }
        }
        gameScanner.close();
    }
}
