package com.training.structural.flyweight;

public class ClassWithSharableState {

  private double j;

  private SharableState sharableState;

  public SharableState getSharableState() {
    return sharableState;
  }

  public void setSharableState(SharableState sharableState) {
    this.sharableState = sharableState;
  }

  public double getJ() {
    return j;
  }

  public void setJ(double j) {
    this.j = j;
  }

  public ClassWithSharableState() {
  }

  public ClassWithSharableState(double j, SharableState sharableState) {
    this.j = j;
    this.sharableState = sharableState;
  }
}
