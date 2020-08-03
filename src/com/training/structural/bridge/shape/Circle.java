package com.training.structural.bridge.shape;

import com.training.structural.bridge.color.Color;

public class Circle implements Shape{

  private Color color;
  private double radius;

  private Circle() {

  }

  private Circle(double radius, Color color) {
    this.radius = radius;
    this.color = color;
  }

  @Override
  public double area() {
    System.out.println(color.showColor());
    return 3.1415 * Math.pow(radius, 2);
  }

  public static Circle getCircle(double radius, Color color){
    return new Circle(radius, color);
  }
}
