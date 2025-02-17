package com.ruander.alakzatok;

public abstract class FemAlakzat {
    private static double fajsuly = 1.2;

    public static double getFajsuly() {
        return fajsuly;
    }
    public abstract double terfogat();

    public double suly(){
        return terfogat()*fajsuly;
    }
}
