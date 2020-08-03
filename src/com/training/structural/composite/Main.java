package com.training.structural.composite;

import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Component[] testClassLeaves = Stream.iterate(0, i -> ++i)
        .limit(101)
        .map(integer -> new TestClassLeaf())
        .map(testClassLeaf -> (Component) testClassLeaf)
        .toArray(Component[]::new);

    TestClassContainer component = new TestClassContainer();
    TestClassContainer componentTest = new TestClassContainer();

    componentTest.setComponents(new TestClassLeaf[]{new TestClassLeaf(),new TestClassLeaf()});

    testClassLeaves[100] = componentTest;

    component.setComponents(testClassLeaves);

    component.doStuff();

  }
}
