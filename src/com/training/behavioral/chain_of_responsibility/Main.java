package com.training.behavioral.chain_of_responsibility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    ChainPart chainStart = new TestClassChainPart();

    List<TestClassChainPart> collect = Stream.generate(() -> 1)
        .limit(100)
        .map(integer -> new TestClassChainPart())
        .collect(Collectors.toList());

    chainStart.setNext(collect.get(0));

    for (int i = 0; i < collect.size() - 1; i++) {
      collect.get(i).setNext(collect.get(i + 1));
    }

    chainStart.handle(1);


  }

}
