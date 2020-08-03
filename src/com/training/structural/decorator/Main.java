package com.training.structural.decorator;

public class Main {


  public static void main(String[] args) {

    Decorator decoratorFinal = new FinalTestClassDecorator();
    Decorator decoratorWrapper = new TestClassDecorator();
    Decorator decoratorFirst = new TestClassDecorator();

    decoratorFirst.set(decoratorWrapper);
    decoratorWrapper.set(decoratorFinal);

    decoratorFirst.doThis();

  }
}
