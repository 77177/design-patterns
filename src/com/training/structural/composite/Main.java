package com.training.structural.composite;

import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Component[] testClassLeaves = Stream.iterate(0, i -> ++i)
        .limit(101)
        .map(integer -> new Leaf())
        .map(leaf -> (Component) leaf)
        .toArray(Component[]::new);

    Container component = new Container();
    Container componentTest = new Container();

    componentTest.setComponents(new Leaf[]{new Leaf(),new Leaf()});

    testClassLeaves[100] = componentTest;

    component.setComponents(testClassLeaves);

    component.doStuff();

  }
}
