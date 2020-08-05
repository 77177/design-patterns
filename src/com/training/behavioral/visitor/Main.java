package com.training.behavioral.visitor;

public class Main {

  public static void main(String[] args) {
    VisitorImpl visitorImpl = new VisitorImpl();

    A a = new A();
    B b = new B();

    a.doStuff(visitorImpl);
    b.doStuff(visitorImpl);
  }

}
