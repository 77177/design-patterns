package com.training.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SharableStateClassFactory {


  private List<SharableState> sharableStates = new ArrayList<>();


  public ClassWithSharableState getTestClass(int i, double j){
    ClassWithSharableState classWithSharableState = new ClassWithSharableState();
    classWithSharableState.setJ(j);

    List<SharableState> correctState = sharableStates.stream()
        .filter(sharableState -> sharableState.getA() == i)
        .collect(Collectors.toList());

    if(correctState.size() == 0){
      SharableState sharableState = new SharableState(i);
      sharableStates.add(sharableState);
      classWithSharableState.setSharableState(sharableState);
    } else {
      SharableState sharableState = correctState.get(0);
      classWithSharableState.setSharableState(sharableState);
    }

    return classWithSharableState;
  }

}
