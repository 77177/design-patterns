package com.training.structural.decorator;

public class TestClassDecorator implements Decorator{

  private Decorator decorator;

  @Override
  public void doThis() {
    System.out.println("test");
    decorator.doThis();
  }

  public void set(Decorator decorator) {
    this.decorator = decorator;
  }
}
