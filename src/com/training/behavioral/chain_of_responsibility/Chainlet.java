package com.training.behavioral.chain_of_responsibility;

public class Chainlet implements ChainPart{

  private ChainPart chainPart;

  @Override
  public void setNext(ChainPart chainPart) {
    this.chainPart = chainPart;
  }

  @Override
  public void handle(Object o) {
    if (chainPart != null){
      if(o.getClass().equals(Integer.class)) {
        System.out.println("testChain");
        chainPart.handle(o);
      } else {
        System.out.println("error - not a proper class");
      }
    } else {
      System.out.println("next handler - null");
    }
  }
}
