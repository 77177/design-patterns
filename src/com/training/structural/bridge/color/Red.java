package com.training.structural.bridge.color;

public class Red implements Color {


  private Red(){

  }

  @Override
  public String showColor() {
    return "red";
  }

  public static Red getRed(){
    return new Red();
  }
}
