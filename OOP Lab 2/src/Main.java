package com.ardamuh;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Mengacak angka lotere
        int lotere = (int)(Math.random() * 100);

        // Input angka untuk menebak
        int guess = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan dua digit angka [00-99]: ");
            guess = input.nextInt();
            if(guess >= 0 && guess < 99) break;
        }while (true);

        // Mendapatkan angka dari random lotere
        int lotereDigit1 = lotere / 10;
        int lotereDigit2 = lotere % 10;

        // Mendapatkan angka dari hasil input
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("Angka lotere hari ini adalah " + lotere);

        // Check the guess
        if (guess == lotere) {
            System.out.println("Sangat cocok! Anda memenangkan $10,000");
        }
        else if (guessDigit2 == lotereDigit1 && guessDigit1 == lotereDigit2) {
            System.out.println("Match semua digit: Anda memenangkan $3,000");
        }
        else if (guessDigit1 == lotereDigit1 || guessDigit1 == lotereDigit2
                || guessDigit2 == lotereDigit1 || guessDigit2 == lotereDigit2) {
            System.out.println("Match satu digit: Anda memenangkan $1,000");
        }
        else{
            System.out.println("Maaf, anda kurang beruntung");
        }
    }
}
