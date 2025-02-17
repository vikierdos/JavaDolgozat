package com.ruander;

import com.ruander.alakzatok.FemAlakzat;

import java.util.ArrayList;

public class FemAlakzatokProgram {
    private ArrayList<FemAlakzat> FemAlakzatLista = new ArrayList<>();

    public void ujAlakzat(FemAlakzat alakzat) {
        FemAlakzatLista.add(alakzat);
    }

    public ArrayList<FemAlakzat> getLista() {
        return new ArrayList<>(FemAlakzatLista);
    }
}
