package com.training.behavioral.visitor;

public class B {

  public void doStuff(Visistor visistor){
    visistor.visit(this);
  }
}
