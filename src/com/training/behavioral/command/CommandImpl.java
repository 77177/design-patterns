package com.training.behavioral.command;

public class CommandImpl implements Command{

  private Receiver receiver;

  public void setReceiver(Receiver receiver) {
    this.receiver = receiver;
  }

  public void execute(){
    System.out.println("the command is enroute");
    receiver.doStuff();
  }

}
