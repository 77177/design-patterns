package com.training.behavioral.state;

public class Main {

  public static void main(String[] args) {
    AllStateClass allStateClass = new AllStateClass();

    allStateClass.changeState(new StateA());

    allStateClass.execute(1);
    allStateClass.execute(2);
    allStateClass.execute(3);
  }
}
