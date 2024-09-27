package com.corndel.sandbox;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

interface Printer {
    void print();
}

 class AbstractPrinter implements Printer  {

     @Override
     public void print() {

     }
 }


public class Sandbox3 {

    public static void main(String[] args) {
    }

    private static void wrapperClass() {
        // List -> ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.get(0);
        // Array
        int[][] matrix = new int[][]{{1},};
        matrix[0][0] = 2;


        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        // auto boxing & un boxing

        int first = numbers.getFirst();
    }
}
