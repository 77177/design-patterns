package com.training.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassFactory {


  private List<SomeState> someStates = new ArrayList<>();


  public TestClass getTestClass(int i, double j){
    TestClass testClass = new TestClass();
    testClass.setJ(j);

    List<SomeState> correctState = someStates.stream()
        .filter(someState -> someState.getA() == i)
        .collect(Collectors.toList());

    if(correctState.size() == 0){
      SomeState someState = new SomeState(i);
      someStates.add(someState);
      testClass.setSomeState(someState);
    } else {
      SomeState someState = correctState.get(0);
      testClass.setSomeState(someState);
    }

    return testClass;
  }

}
