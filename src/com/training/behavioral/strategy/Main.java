package com.training.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    TestClass testClass = new TestClass();

    testClass.setStrategy(new StrategyA());

    testClass.execute();

    testClass.setStrategy(new StrategyB());

    testClass.execute();
  }

}
