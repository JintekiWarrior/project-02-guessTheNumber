package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner gameScanner = new Scanner(System.in);
        while (true)
        {
            gameInit();
            System.out.println("Would you like to play again? (y or n)");
            char playAgain = gameScanner.next().charAt(0);
            char no = 'n';
            if (playAgain == no)
            {
                System.out.println("Come back soon muahahahaha!");
                break;
            }
        }
        gameScanner.close();
    }

    public static int randomNumber()
    {
        int number = (int)Math.floor(Math.random()*(21 - 1)+1);
        return number;
    }

    public static void gameInit()
    {
        int randomNumber = randomNumber();
        int guess = 0;
        int count = 5;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello, what be thy name?");
        String name = myScanner.nextLine();
        System.out.println("Sup, " + name + " guess a number between 1 and 20 if you want to live.");

        while (guess != randomNumber && count > 0)
        {
            if (guess != 0)
            {
                System.out.println("You have " + count + " tries left. Try again");
            }
            guess = myScanner.nextInt();
            if (guess > randomNumber)
            {
                System.out.println("Too high");
            } else if (guess < randomNumber)
            {
                System.out.println("Too low");
            }
            count--;
        }
        if (guess == randomNumber)
        {
            System.out.println("Great job, I will let you keep your head.");
        } else
        {
            System.out.println("Well, off with your head.");
        }
    }
}
