package com.training.structural.flyweight;

public class TestClass {

  private double j;

  private SomeState someState;

  public SomeState getSomeState() {
    return someState;
  }

  public void setSomeState(SomeState someState) {
    this.someState = someState;
  }

  public double getJ() {
    return j;
  }

  public void setJ(double j) {
    this.j = j;
  }

  public TestClass() {
  }

  public TestClass(double j, SomeState someState) {
    this.j = j;
    this.someState = someState;
  }
}
