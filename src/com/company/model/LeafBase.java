package com.company.model;

import java.util.ArrayList;
import java.util.List;

//nasada liścia, z której wyrastają liście
public abstract class LeafBase {
    private List<Leaf> leaves;

    public LeafBase() {
        this.leaves = new ArrayList<>();
    }

    public void expand(DNA dna){
        leaves.add(new Leaf(dna.getLeafShape()));
    }

    public LeafBase(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public int getLeavesCount() {
        return leaves.size();
    }

    public void dropLeaves() {
        this.leaves = new ArrayList<>();
    }

    public void restoreLeaves(DNA dna) {
        for (int i = 0; i < dna.getNumberOfLeavesPerLeafBase(); i++) {
            leaves.add(new Leaf(dna.getLeafShape()));
        }
    }
}
