package com.training.behavioral.iterator;

public class FrontIterator implements Iterator {

  private int position;
  private IntList list;

  public FrontIterator(IntList list) {
    this.position = -1;
    this.list = list;
  }

  @Override
  public Object getNext() {

    position++;

    if(position > list.getBound()){
      throw  new RuntimeException("out of bounds");
    }


    return list.get(position);

  }
}
