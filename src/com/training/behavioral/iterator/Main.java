package com.training.behavioral.iterator;

import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    IntList intList = new IntList();

    long count = Stream.iterate(0, i -> ++i)
        .limit(200)
        .peek(intList::add)
        .count();

    Iterator backIterator = intList.getBackIterator();
    Iterator frontIterator = intList.getFrontIterator();
    while (true){
      System.out.println(backIterator.getNext());
      System.out.println(frontIterator.getNext());
    }




  }

}
