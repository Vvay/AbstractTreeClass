package com.company.model;

//liść
public class Leaf {
    private LeafShape shape;

    public Leaf() {
    }

    public Leaf(LeafShape shape) {
        this.shape = shape;
    }

    public LeafShape getShape() {
        return shape;
    }

    public void setShape(LeafShape shape) {
        this.shape = shape;
    }
}
