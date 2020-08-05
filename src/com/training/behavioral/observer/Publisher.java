package com.training.behavioral.observer;

public class Publisher {

  private Subscriber[] subscribers;

  public void setSubscribers(Subscriber[] subscribers) {
    this.subscribers = subscribers;
  }

  private void notifySubscribers(){
    for (Subscriber subscriber : subscribers) {
      subscriber.execute();
    }
  }

  public void doStuff(){
    System.out.println("doing stuff");
    notifySubscribers();
  }


}
