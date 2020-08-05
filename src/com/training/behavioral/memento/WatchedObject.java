package com.training.behavioral.memento;

public class WatchedObject {

  private int anInt;

  public void setAnInt(int anInt) {
    this.anInt = anInt;
  }

  public int getAnInt() {
    return anInt;
  }

  public void increment(){
    this.anInt++;
  }

  public Memento save(){
    return new Memento(this);
  }

  public void restore(Memento memento){
    this.anInt = memento.getAnInt();
  }
}
