package com.training.behavioral.iterator;

public class BackIterator implements Iterator {

  private int position;
  private IntList list;

  public BackIterator(IntList list) {
    this.position = list.getBound();
    this.list = list;
  }

  @Override
  public Object getNext() {
    position--;

    if (position < 0){
      throw new RuntimeException("out of bounds");
    }


    return list.get(position);
  }
}
