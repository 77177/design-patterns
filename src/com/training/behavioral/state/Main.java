package com.training.behavioral.state;

public class Main {

  public static void main(String[] args) {
    TestClass testClass = new TestClass();

    testClass.changeState(new StateA());

    testClass.execute(1);
    testClass.execute(2);
    testClass.execute(3);
  }
}
