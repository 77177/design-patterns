package com.training.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    AllStrategyClass allStrategyClass = new AllStrategyClass();

    allStrategyClass.setStrategy(new StrategyA());

    allStrategyClass.execute();

    allStrategyClass.setStrategy(new StrategyB());

    allStrategyClass.execute();
  }

}
