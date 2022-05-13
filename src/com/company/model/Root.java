package com.company.model;

import java.util.ArrayList;
import java.util.List;

//korzeń
public class Root {
    private final List<Root> roots;

    public Root() {
        this.roots = new ArrayList<>();
    }

    public Root(List<Root> roots) {
        this.roots = roots;
    }

}
