package com.training.behavioral.chain_of_responsibility;

public interface ChainPart {

  public void setNext(ChainPart chainPart);

  public void handle(Object o);
}
