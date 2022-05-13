package com.company.model;

import com.company.data.Singleton;

//klasa przechowuje wszelkie informacje na temat gatunku drzewa,
//w przyszłości może zawierać także dokładniejsze schematy rozrastania drzew, np: rozkład gałęzi
public class DNA {
    private LeafShape leafShape;
    private Boolean isLosingLeavesForTheWinter;
    private int numberOfLeavesPerLeafBase;
    // ToDO: kwiaty, owoce, gęstość ulistnienia (np. drzewa iglaste mają gęsto ułożone liście)

    public DNA() {
        this.leafShape = Singleton.defaultLeafShape;
        this.isLosingLeavesForTheWinter = Singleton.defaultIsLosingLeavesForTheWinter;
        this.numberOfLeavesPerLeafBase = Singleton.defaultNumberOfLeavesPerLeafBase;
    }

    public DNA(LeafShape leafShape, Boolean isLosingLeavesForTheWinter, int numberOfLeavesPerLeafBase) {
        this.leafShape = leafShape;
        this.isLosingLeavesForTheWinter = isLosingLeavesForTheWinter;
        this.numberOfLeavesPerLeafBase = numberOfLeavesPerLeafBase;
    }

    public LeafShape getLeafShape() {
        return leafShape;
    }

    public void setLeafShape(LeafShape leafShape) {
        this.leafShape = leafShape;
    }

    public Boolean getLosingLeavesForTheWinter() {
        return isLosingLeavesForTheWinter;
    }

    public void setLosingLeavesForTheWinter(Boolean losingLeavesForTheWinter) {
        isLosingLeavesForTheWinter = losingLeavesForTheWinter;
    }

    public int getNumberOfLeavesPerLeafBase() {
        return numberOfLeavesPerLeafBase;
    }

    public void setNumberOfLeavesPerLeafBase(int numberOfLeavesPerLeafBase) {
        this.numberOfLeavesPerLeafBase = numberOfLeavesPerLeafBase;
    }
}
