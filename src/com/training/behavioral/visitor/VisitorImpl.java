package com.training.behavioral.visitor;

public class VisitorImpl implements Visistor {

  @Override
  public void visit(A o) {
    System.out.println("visited A");
  }

  @Override
  public void visit(B o) {
    System.out.println("visited B");
  }
}
