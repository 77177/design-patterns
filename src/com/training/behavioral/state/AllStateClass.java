package com.training.behavioral.state;

public class AllStateClass {

  private State cutrrentState;

  public void changeState(State state){
    this.cutrrentState = state;
  }

  public void execute(Object o){
    cutrrentState.doThings(o);

    if(cutrrentState.getClass().equals(StateA.class)){
      cutrrentState = new StateB();
    } else {
      cutrrentState = new StateA();

    }
  }

}
