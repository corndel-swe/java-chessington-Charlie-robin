package com.corndel.exercises;

import com.sun.jdi.PathSearchingVirtualMachine;

// PascalCasing
// camelCasing
public class Counter {

    // DEFINE INSTANCE VARIABLES
    // DEFINE CONSTRUCTOR
    // DEFINE METHODS


    // YOU COULD USE MAIN


    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void reset() {
        count = 0;
    }

}