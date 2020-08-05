package com.training.behavioral.observer;

public class SubscriberImpl implements Subscriber {

  private static int count;

  private int index;

  public SubscriberImpl() {
    index = count;
    ++count;
  }

  @Override
  public void execute() {
    System.out.println("subscriber " + index + " notified ");
  }
}
