package com.company.data;

import com.company.model.LeafShape;

public final class Singleton {
    //postanowiłam wykorzystać Singleton do przechowania kilku domyślnych wartości
    //żeby uniknąć w kodzie tzw. "wstawiania wartośći na sztywno"
    //w tym miejscu będzie łatwo je zmodyfikować, a także zlokalizować
    public static LeafShape defaultLeafShape = new LeafShape();
    public static boolean defaultIsLosingLeavesForTheWinter = false;
    public static int defaultNumberOfLeavesPerLeafBase = 2;
    public static int defaultTrunkNumberOfRings = 1;
    public static double defaultBranchLength = 0.1d;
    public static double defaultBranchRadius = 0.1d;
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }



}
