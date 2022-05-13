package com.company.model;

public interface TreeInterface {
    static int a =2;

    public void doSpringThings();

    void doSummerThings();

    void doAutumnThings();

    void doWinterThings();

    void growUp();

    void dropLeaves();

    void restoreLeaves();

    void changeSeason(Season season);

    void bloomFlowers();

    void dropFruit();

    void createFruit();

    void increaseNumberOfRings();

    DNA getDna();

    void setDna(DNA dna);

    Trunk getTrunk();

    void setTrunk(Trunk trunk);

    Root getRoot();

    void setRoot(Root root);

    Branch getBranch();

    void setBranch(Branch branch);
}
