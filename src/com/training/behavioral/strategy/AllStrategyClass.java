package com.training.behavioral.strategy;

public class AllStrategyClass {

  private Strategy strategy;

  public void execute(){
    strategy.doStuff();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
