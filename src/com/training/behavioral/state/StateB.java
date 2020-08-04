package com.training.behavioral.state;

public class StateB implements State {

  @Override
  public void doThings(Object o) {
    System.out.println("state B " + o);
  }
}
