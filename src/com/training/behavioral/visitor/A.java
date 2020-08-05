package com.training.behavioral.visitor;

public class A {

  public void doStuff(Visistor visistor){
    visistor.visit(this);
  }

}
