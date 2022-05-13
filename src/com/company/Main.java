package com.company;

import com.company.model.DNA;
import com.company.model.LeafShape;
import com.company.tree.MapleTree;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //example
        DNA dna = new DNA(new LeafShape(), true, 2);
        MapleTree tree = new MapleTree(dna);
        tree.growUp();
    }
}
