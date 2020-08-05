package com.training.behavioral.command;

public class Sender {

  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand(){
    System.out.println("send command");
    command.execute();
  }
}
