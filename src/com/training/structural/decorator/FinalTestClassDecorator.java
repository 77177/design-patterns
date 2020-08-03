package com.training.structural.decorator;

public class FinalTestClassDecorator implements Decorator {

  @Override
  public void doThis() {
    System.out.println("final");
  }

  @Override
  public void set(Decorator decorator) {
    System.out.println("this is the base final decorator - impossible to set the next decorator");
  }

}
