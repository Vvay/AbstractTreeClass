package com.company.model;

public abstract class Tree implements TreeInterface {

    private DNA dna;
    private Trunk trunk;
    private Root root;
    private Branch branch;

    public Tree() {
        this.dna = null;
        this.trunk = new Trunk();
        this.root = new Root();
        this.branch = new Branch();
    }

    public Tree(DNA dna) {
        this.dna = dna;
        this.trunk = new Trunk();
        this.root = new Root();
        this.branch = new Branch();
    }

    public Tree(DNA dna, Trunk trunk, Branch branch, Root root) {
        this.dna = dna;
        this.trunk = trunk;
        this.root = root;
        this.branch = branch;
    }

    protected abstract void expandBranches();

    protected abstract void expandTrunk();

    public void expandRoots() {
        //ToDo
    }

    @Override
    public void changeSeason(Season season) {
        switch (season) {
            case SPRING -> doSpringThings();
            case SUMMER -> doSummerThings();
            case AUTUMN -> doAutumnThings();
            case WINTER -> doWinterThings();
        }
    }

    @Override
    public void doSpringThings() {
        increaseNumberOfRings();
        restoreLeaves();
        bloomFlowers();
    }

    @Override
    public void doSummerThings() {
        createFruit();
    }

    @Override
    public void doAutumnThings() {
        increaseNumberOfRings();
        if (dna.getLosingLeavesForTheWinter()) {
            dropLeaves();
        }
        dropFruit();
    }

    @Override
    public void doWinterThings() {
        //ToDo
    }

    @Override
    public void growUp() {
        expandBranches();
        expandTrunk();
        expandRoots();
    }

    @Override
    public void dropLeaves() {
        branch.dropLeaves();
    }

    @Override
    public void restoreLeaves() {
        branch.restoreLeaves(dna);
    }

    @Override
    public void bloomFlowers() {
        branch.bloomFlowers();
    }

    @Override
    public void dropFruit() {
        branch.dropFruit();
    }

    @Override
    public void createFruit() {
        branch.createFruit();
    }

    @Override
    public void increaseNumberOfRings() {
        trunk.increaseNumberOfRings();
    }

    @Override
    public DNA getDna() {
        return dna;
    }

    @Override
    public void setDna(DNA dna) {
        this.dna = dna;
    }

    @Override
    public Trunk getTrunk() {
        return trunk;
    }

    @Override
    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    @Override
    public Root getRoot() {
        return root;
    }

    @Override
    public void setRoot(Root root) {
        this.root = root;
    }

    @Override
    public Branch getBranch() {
        return branch;
    }

    @Override
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}
