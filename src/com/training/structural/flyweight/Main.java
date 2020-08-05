package com.training.structural.flyweight;

public class Main {

  public static void main(String[] args) {
    SharableStateClassFactory sharableStateClassFactory = new SharableStateClassFactory();

    sharableStateClassFactory.getTestClass(1,2);
    sharableStateClassFactory.getTestClass(1,23);
    sharableStateClassFactory.getTestClass(1,3);
    sharableStateClassFactory.getTestClass(1,4);
    sharableStateClassFactory.getTestClass(4,5);
    sharableStateClassFactory.getTestClass(1,6);
  }

}
