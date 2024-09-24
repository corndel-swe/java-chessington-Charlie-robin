package com.corndel.sandbox;

// SUPER CLASS
class Bread {
    private double weight;
    private boolean isSliced;
    private boolean isGlutenFree;

    public Bread(double weight, boolean isSliced, boolean isGlutenFree) {
        this.weight = weight;
        this.isSliced = isSliced;
        this.isGlutenFree = isGlutenFree;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bake() {
        System.out.println("Baking for 5 minutes");
    }

    public String getInfo(){
        return String.format("Weighs %f", weight);
    }
}

// SUB CLASS
class Roll extends Bread {
    private double radius;

    public Roll(double weight, double radius) {
        super(weight, false, false);
        this.radius = radius;
    }
}

class WellFired extends Bread {

    public WellFired(double weight) {
        super(weight, true, true);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Baking for 10 minutes");
    }

    @Override
    public String getInfo() {
        return super.getInfo().toUpperCase();
    }
}


public class Sandbox2 {

    public static void main(String[] args) {
        Roll roll = new Roll(2.2, 4.5);
        WellFired wellFired = new WellFired(5);
        roll.bake();
        System.out.println(roll.getInfo());
        wellFired.bake();
        System.out.println(wellFired.getInfo());

    }
}


