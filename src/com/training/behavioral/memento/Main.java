package com.training.behavioral.memento;

public class Main {

  public static void main(String[] args) {
    Organizer organizer = new Organizer();

    organizer.setWatchedObject(new WatchedObject());

    for (int i = 0; i < 10; i++) {
      organizer.doStuffWithTestClass();
      organizer.getState();
    }

    for (int i = 0; i < 10; i++) {
      organizer.undo();
      organizer.getState();
    }
  }

}
