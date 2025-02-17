package com.ruander;

import com.ruander.alakzatok.FemAlakzat;
import com.ruander.alakzatok.Gomb;

import java.util.ArrayList;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> FemAlakzatLista = new ArrayList<>();

    public void ujAlakzat(FemAlakzat alakzat) {
        FemAlakzatLista.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return new ArrayList<>(FemAlakzatLista);
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FemAlakzat alakzat : FemAlakzatLista) {
            osszSuly += alakzat.suly();
        }

        return osszSuly;
    }

    public double gombokOsszSuly() {
        double osszGSuly = 0;
        for (FemAlakzat alakzat : FemAlakzatLista) {
            if (alakzat instanceof Gomb){
                osszGSuly += alakzat.suly();
            }
        }
        return osszGSuly;
    }

    public FemAlakzat minV() {
        int min = 0;
        for (int i = 1; i < FemAlakzatLista.size(); i++) {
            if(FemAlakzatLista.get(min).terfogat() > FemAlakzatLista.get(i).terfogat()){
                min = i;
            }
        }
        return FemAlakzatLista.get(1);
    }

    public FemAlakzat maxV() {
        int max = 0;
        for (int i = 1; i < FemAlakzatLista.size(); i++) {
            if(FemAlakzatLista.get(max).terfogat() < FemAlakzatLista.get(i).terfogat()){
                max = i;
            }
        }
        return FemAlakzatLista.get(max);
    }
}
