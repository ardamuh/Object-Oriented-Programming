package com.ardamuh;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an interger for seconds : ");
        int seconds = input.nextInt();
        int minutes = seconds % 3600 / 60;
        int seconds_output = seconds % 3600 % 60;
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + seconds_output + " seconds");
    }
}
