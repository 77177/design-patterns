package com.training.behavioral.state;

public class StateA implements State {
  @Override
  public void doThings(Object o) {
    System.out.println("state A " + o);
  }
}
