package com.ardamuh;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int IntHari = 0, TotalHari, ResultHari;
        String IsiHari;
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama hari: ");
        IsiHari = input.nextLine();
        IsiHari.toLowerCase();

        System.out.print("Masukan jumlah hari : ");
        TotalHari = input.nextInt();

        for (int i = 0; i < hari.length; i++)
        {
            if (IsiHari.equals(hari[i])) {
                IntHari = i;
                break;
            }
        }

        ResultHari = (IntHari + (TotalHari % 7)) % 7;

        System.out.println("Hari ini adalah " + IsiHari + ", maka pada " + TotalHari + " hari berikutnya adalah hari " + hari[ResultHari]);

    }
}
