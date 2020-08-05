package com.training.behavioral.memento;

public class Memento {

  private int anInt;

  public void setAnInt(int anInt) {
    this.anInt = anInt;
  }

  public int getAnInt() {
    return anInt;
  }

  public Memento(WatchedObject watchedObject) {
    this.anInt = watchedObject.getAnInt();
  }
}
