package com.training.behavioral.observer;

import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Publisher publisher = new Publisher();

    Subscriber[] subscribers = Stream.generate(() -> 100)
        .limit(100)
        .map(integer -> new SubscriberImpl())
        .map(subscriber -> (Subscriber) subscriber)
        .toArray(Subscriber[]::new);


    publisher.setSubscribers(subscribers);

    publisher.doStuff();
  }

}
