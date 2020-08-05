package com.training.structural.proxy;

public class ProxySomeClass extends SomeClass {

  @Override
  public String getHelloWorld() {
    String str = "||";
    str += super.getHelloWorld();
    str += "||";
    return str;
  }
}
