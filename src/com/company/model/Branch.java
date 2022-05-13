package com.company.model;

import com.company.data.Singleton;

import java.util.ArrayList;
import java.util.List;

//gałąż
public class Branch {

    private double length;
    private double radius;
    private List<Branch> branches;
    private List<Bud> buds;

    public Branch() {
        this.length = Singleton.defaultBranchLength;
        this.radius = Singleton.defaultBranchRadius;
        this.branches = new ArrayList<>();
        this.buds = new ArrayList<>();
        this.buds.add(new Bud());
    }

    public Branch(double length, double radius, List<Branch> branches, List<Bud> buds) {
        this.length = length;
        this.radius = radius;
        this.branches = branches;
        this.buds = buds;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }


    public List<Bud> getBuds() {
        return buds;
    }

    public void setBuds(List<Bud> buds) {
        this.buds = buds;
    }

    public void dropLeaves() {
        for (Bud bud : buds) {
            bud.dropLeaves();
        }
        for (Branch b : branches) {
            b.dropLeaves();
        }
    }

    public void restoreLeaves(DNA dna) {
        for (Bud bud : buds) {
            bud.restoreLeaves(dna);
        }
        for (Branch b : branches) {
            b.restoreLeaves(dna);
        }
    }

    public void bloomFlowers() {
        for (Bud bud : buds) {
            bud.bloomFlowers();
        }
        for (Branch b : branches) {
            b.bloomFlowers();
        }
    }

    public void createFruit() {
        for (Bud bud : buds) {
            bud.createFruit();
        }
        for (Branch b : branches) {
            b.createFruit();
        }
    }

    public void dropFruit() {
        for (Bud bud : buds) {
            bud.dropFruit();
        }
        for (Branch b : branches) {
            b.dropFruit();
        }
    }
}
