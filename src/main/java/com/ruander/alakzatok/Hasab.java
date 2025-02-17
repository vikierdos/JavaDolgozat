package com.ruander.alakzatok;

public class Hasab extends FemAlakzat {
    private double a;
    private double b;
    private double c;

    public Hasab(double a, double b, double c) {
        super();
    }

    @Override
    public double terfogat() {
        return a*b*c;
    }
}
