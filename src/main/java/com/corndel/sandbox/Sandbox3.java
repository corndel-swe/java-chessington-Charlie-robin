package com.corndel.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Sandbox3 {

    public static void main(String[] args) {
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
