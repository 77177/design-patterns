package com.training.structural.composite;

public class TestClassContainer implements Component {

  private Component[] components;

  public void setComponents(Component[] components){
    this.components = components;
  }

  @Override
  public void doStuff() {
    System.out.println("container doing stuff");
    for (Component component : components) {
      component.doStuff();
    }
  }


}
