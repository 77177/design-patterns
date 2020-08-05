package com.training.behavioral.mediator;

public class Main {

  public static void main(String[] args) {
    MediatorImpl mediator = new MediatorImpl();

    A a = new A(mediator);
    mediator.setA(a);
    mediator.setB(new B(mediator));

    a.doStuff();
  }

}
