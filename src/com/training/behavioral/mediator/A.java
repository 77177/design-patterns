package com.training.behavioral.mediator;

public class A {

  private Mediator mediator;

  public A(MediatorImpl mediator) {
    this.mediator = mediator;
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void doStuff(){
    mediator.notify(this);
  }
}
