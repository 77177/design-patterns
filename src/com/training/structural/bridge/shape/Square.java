package com.training.structural.bridge.shape;

import com.training.structural.bridge.color.Color;

public class Square implements Shape {

  private double side;
  private Color color;

  private Square(){

  }

  private Square(double side, Color color){
    this.side = side;
    this.color = color;
  }

  @Override
  public double area() {
    System.out.println(color.showColor());
    return Math.pow(side, 2);
  }

  public static Square getSquare(double side, Color color){
    return new Square(side, color);
  }

}
