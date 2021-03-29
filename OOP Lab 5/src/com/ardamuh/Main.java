package com.ardamuh;

public class Main {

    public static void main(String[] args) {
        //Soal nomor 1
        Tabung tbg1 = new Tabung(5,10);
        System.out.println(("Tabung Pertama : "));
        System.out.println("Radius = " + tbg1.radius);
        System.out.println("Tinggi = " + tbg1.tinggi);
        System.out.println("Luas Alas = " + tbg1.getLuasAlas());
        System.out.println("Volume =  " + tbg1.getVolume() + "\n");


        Tabung tbg2 = new Tabung(7.5,15.5);
        System.out.println(("Tabung Kedua : "));
        System.out.println("Radius = " + tbg2.radius);
        System.out.println("Tinggi = " + tbg2.tinggi);
        System.out.println("Luas Alas = " + tbg2.getLuasAlas());
        System.out.println("Volume =  " + tbg2.getVolume() + "\n");
    }
}