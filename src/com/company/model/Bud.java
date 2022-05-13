package com.company.model;

import java.util.ArrayList;
import java.util.List;

//pąk
public class Bud {
    private List<Flower> flowers;
    private List<Fruit> fruits;
    private List<LeafBase> leafBases;

    public Bud() {
        this.flowers = new ArrayList<>();
        this.fruits = new ArrayList<>();
        this.leafBases = new ArrayList<>();
    }


    public void bloomFlowers() {
        //ToDo
    }

    public void createFruit() {
        //ToDo
    }

    public void dropFruit() {
        //ToDo
    }


    public void dropLeaves() {
        for (LeafBase base : leafBases) {
            base.dropLeaves();
        }
    }

    public void restoreLeaves(DNA dna) {
        for (LeafBase base : leafBases) {
            base.restoreLeaves(dna);
        }
    }

    public List<LeafBase> getLeafBases() {
        return leafBases;
    }

    public void setLeafBases(List<LeafBase> leafBases) {
        this.leafBases = leafBases;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

}
