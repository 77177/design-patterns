package com.training.structural.flyweight;

public class SharableState {

  private int a;

  public SharableState() {
  }

  public SharableState(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }
}
