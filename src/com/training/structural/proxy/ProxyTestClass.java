package com.training.structural.proxy;

public class ProxyTestClass extends TestClass {

  @Override
  public String getHelloWorld() {
    String str = "||";
    str += super.getHelloWorld();
    str += "||";
    return str;
  }
}
