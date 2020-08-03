package com.training.structural.adapter;

public class Adapter implements AdapterInterface {

    B b;

    @Override
    public void doStuff() {
        b.hello();
    }

    @Override
    public void setObj(Object o) {
        this.b = (B) o;
    }

}
