package com.training.structural.proxy;

public class Main {

  public static void main(String[] args) {
    SomeClass helloWorld = new ProxySomeClass();
    System.out.println(helloWorld.getHelloWorld());
  }

}
