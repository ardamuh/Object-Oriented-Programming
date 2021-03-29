package com.ardamuh;

import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static void main(String[] args) {
        //Soal nomor 2
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Pada hari ini, tanggal : " + calendar.get(GregorianCalendar.DATE));
        System.out.println("Bulan : " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Tahun : " + calendar.get(GregorianCalendar.YEAR));


        long dy = TimeUnit.MILLISECONDS.toDays(calendar.getTimeInMillis());
        final long yr = dy / 365;
        dy %= 365;
        final long mn = dy / 30;
        dy %= 30;
        System.out.println("1 januari 1970 hingga hari ini yaitu " + yr + " Tahun " + mn + " Bulan " + dy + " hari");
    }
}