package com.training.structural.decorator;

public class Main {


  public static void main(String[] args) {

    Decorator decoratorFinal = new FinalDecorator();
    Decorator decoratorWrapper = new IntermediateDecorator();
    Decorator decoratorFirst = new IntermediateDecorator();

    decoratorFirst.set(decoratorWrapper);
    decoratorWrapper.set(decoratorFinal);

    decoratorFirst.doThis();

  }
}
