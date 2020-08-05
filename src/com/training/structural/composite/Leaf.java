package com.training.structural.composite;

public class Leaf implements Component {

  @Override
  public void doStuff() {
    System.out.println("leaf doing stuff");
  }
}
