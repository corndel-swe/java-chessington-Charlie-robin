package com.corndel.exercises;

public class Maths {
    public final static double PI = 3.14;

    public static double max(double a, double b){
        return Math.max(a, b);
    }

    public static double round(double i) {
        double decimal = i % 1;

        if (decimal == 0){
            return i;
        } else if (decimal >= .5){
            return i + (1 - decimal);
        } else {
            return i - decimal;
        }

    }

    public static void main(String[] args) {
        System.out.println(1231.5 % 1);
    }
}