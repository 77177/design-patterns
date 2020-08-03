package com.training.structural.proxy;

public class Main {

  public static void main(String[] args) {
    TestClass helloWorld = new ProxyTestClass();
    System.out.println(helloWorld.getHelloWorld());
  }

}
