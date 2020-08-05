package com.training.behavioral.mediator;

public class B {

  private Mediator mediator;

  public B(MediatorImpl mediator) {
    this.mediator = mediator;
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void doStuff(){
    mediator.notify(this);
  }

}
