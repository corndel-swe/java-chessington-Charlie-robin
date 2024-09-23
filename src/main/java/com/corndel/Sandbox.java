package com.corndel;

class Cat {
    private String colour;

    public Cat(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                '}';
    }
}

public class Sandbox {
    public static void main(String[] args) {
        Cat c1 = new Cat("Black");
        Cat c2 = new Cat("Black");
//        c2 = new Cat("Ginger");
//        c1.setColour("White");
//        c1 = new Cat("White");
//        System.out.println(c2.getColour()); // Black
        System.out.println("C1 : " + c1);
        System.out.println("C2 : " + c2);
        c1.setColour("White");
        System.out.println("-".repeat(10));
        System.out.println("C1 : " + c1);
        System.out.println("C2 : " + c2);

    }
}
