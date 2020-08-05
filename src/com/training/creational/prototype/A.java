package com.training.creational.prototype;

public class A {

    private int a;

    public A(A as){
        this.a = as.a;
    }

    public A(){}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
