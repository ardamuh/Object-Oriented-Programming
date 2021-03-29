package com.ardamuh;

public class Tabung {
    public double radius, tinggi;

    //Nilai default
    Tabung(){
        radius = 1;
        tinggi = 1;
    }

    //Nilai bebas
    Tabung(double r, double t){
        radius = r;
        tinggi = t;
    }

    public double getVolume(){
        return Math.PI * radius * radius * tinggi;
    }

    public double getLuasAlas(){
        return Math.PI * radius * radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public void setTinggi(double t){
        tinggi = t;
    }
}