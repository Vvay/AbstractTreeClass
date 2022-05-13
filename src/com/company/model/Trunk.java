package com.company.model;

import com.company.data.Singleton;

public class Trunk {
    //pierścienie drzewa
    private int numberOfRings;

    public Trunk() {
        this.numberOfRings = Singleton.defaultTrunkNumberOfRings;
    }

    public Trunk(int numberOfRings) {
        this.numberOfRings = numberOfRings;
    }

    public void increaseNumberOfRings() {
        this.numberOfRings++;
    }

    public int getNumberOfRings() {
        return numberOfRings;
    }

    public void setNumberOfRings(int numberOfRings) {
        this.numberOfRings = numberOfRings;
    }
}
