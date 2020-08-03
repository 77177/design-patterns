package com.training.structural.flyweight;

public class Main {

  public static void main(String[] args) {
    TestClassFactory testClassFactory = new TestClassFactory();

    testClassFactory.getTestClass(1,2);
    testClassFactory.getTestClass(1,23);
    testClassFactory.getTestClass(1,3);
    testClassFactory.getTestClass(1,4);
    testClassFactory.getTestClass(4,5);
    testClassFactory.getTestClass(1,6);
  }

}
