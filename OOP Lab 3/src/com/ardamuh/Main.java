package com.ardamuh;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int userGuess = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        do {
            System.out.print("Enter your guess: ");
            if(userInput.hasNextInt()) {
                userGuess = userInput.nextInt();
                if (userGuess == secretNumber)
                {
                    System.out.println("You Win the Game! the number is " + secretNumber);
                    break;
                }
                else if (userGuess < secretNumber)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuess > secretNumber)
                    System.out.println("Your Guess Number is Greater.");
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuess != secretNumber);
    }
}