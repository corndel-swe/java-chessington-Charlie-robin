package com.corndel.exercises;

public class Circle implements Shape {
  protected double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return radius * radius * Maths.PI;
  }

  @Override
  public double getPerimeter() {
    return radius * 2 * Maths.PI;
  }
}

