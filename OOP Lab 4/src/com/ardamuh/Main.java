package com.ardamuh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String city1;
        String city2;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please Enter First City =  ");
        city1=keyboard.nextLine();
        System.out.print("Please Enter Second City =  ");
        city2=keyboard.nextLine();

        if((city1.compareTo(city2) > 0)) {
                System.out.println("Both city in alphabetical order : " + city2 + " - " + city1 );
            }else{
                System.out.println("Both city in alphabetical order : " + city1 + " - " + city2 );
        }
    }
}
