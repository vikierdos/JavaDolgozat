package com.ruander.alakzatok;

public class Hasab extends FemAlakzat {
    private double a;
    private double b;
    private double m;

    public Hasab(double a, double b, double m) {
        super();
        this.a = a;
        this.b = b;
        this.m = m;
    }

    @Override
    public double terfogat() {
        return a*b*m;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }
}
