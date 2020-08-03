package com.training.structural.bridge;

import com.training.structural.bridge.color.Red;
import com.training.structural.bridge.shape.Shape;
import com.training.structural.bridge.shape.Square;

public class Main {

  public static void main(String[] args) {
    Shape shape = Square.getSquare(12, Red.getRed());

    System.out.println(shape.area());
  }
}
