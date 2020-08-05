package com.training.behavioral.iterator;

import static java.util.Arrays.copyOfRange;

import java.util.Arrays;

public class IntList implements Iterable{

  private int size = 100;
  private int bound = 0;
  private int[] ints = new int[size];

  public int getBound() {
    return bound;
  }

  public void add(int i) {
    if(bound == size){
      size *= 2;
      int[] newInts = new int[size];
      System.arraycopy(ints, 0,newInts, 0, ints.length);
      ints = newInts;
    }
     ints[bound] = i;
    ++bound;
  }

  public void remove(int index) {
    int[] endRange = copyOfRange(this.ints, index + 1, bound);

    if (bound - index >= 0) {
      System.arraycopy(endRange, 0, ints, index, endRange.length);
    }
    bound--;
  }

  public int get(int index) {
    return ints[index];
  }

  public void printAll(){
    Arrays.stream(ints).limit(bound).forEach(System.out::println);
  }

  @Override
  public Iterator getFrontIterator() {
    return new FrontIterator(this);
  }

  @Override
  public Iterator getBackIterator() {
    return new BackIterator(this);
  }
}
