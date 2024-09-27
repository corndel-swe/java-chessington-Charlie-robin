package com.corndel.exercises;

public class Square extends Rectangle {

  public Square(double side) {
    super(side, side);
    Circle circle = new Circle(2);
    circle.radius = 55;
  }

}
