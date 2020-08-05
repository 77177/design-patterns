package com.training.behavioral.mediator;

public class MediatorImpl implements Mediator{

  private A a;
  private B b;

  public void setA(A a) {
    this.a = a;
  }

  public void setB(B b) {
    this.b = b;
  }

  @Override
  public void notify(Object o) {
      if(o.getClass().equals(A.class)){
        forA();
      } else if (o.getClass().equals(B.class)){
        forB();
      }
  }

  private void forA(){
    System.out.println("calling B");
    b.doStuff();
  }

  private void forB(){
    System.out.println("calling A");
  }
}
