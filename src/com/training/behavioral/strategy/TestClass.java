package com.training.behavioral.strategy;

public class TestClass {

  private Strategy strategy;

  public void execute(){
    strategy.doStuff();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
