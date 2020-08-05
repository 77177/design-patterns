package com.training.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Organizer {

  private WatchedObject watchedObject;

  private List<Memento> mementos = new ArrayList<>();

  public void setWatchedObject(WatchedObject watchedObject) {
    this.watchedObject = watchedObject;
  }

  public void doStuffWithTestClass(){
    mementos.add(this.watchedObject.save());
    this.watchedObject.increment();
  }

  public void undo(){
    int last = mementos.size() - 1;
    this.watchedObject.restore(mementos.get(last));
    mementos.remove(last);
  }

  public void getState(){
    System.out.println(this.watchedObject.getAnInt());
  }
}
