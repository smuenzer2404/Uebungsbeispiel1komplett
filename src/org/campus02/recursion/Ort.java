package org.campus02.recursion;

import java.util.ArrayList;

public class Ort {

    private String name;
    private ArrayList<Ort> neighbors = new ArrayList<>();

    public void add(Ort o) {
        neighbors.add(o);
    }

}
