package com.training.behavioral.command;

public class Main {

  public static void main(String[] args) {
    CommandImpl command = new CommandImpl();

    Receiver receiver = new Receiver();
    command.setReceiver(receiver);

    Sender sender = new Sender();
    sender.setCommand(command);

    sender.executeCommand();
  }

}
