package com.training.structural.adapter;

public class Main {

    public static void main(String[] args) {
        B b = new B();

        AdapterInterface adapterInterface = new Adapter();
        adapterInterface.setObj(b);

        adapterInterface.doStuff();
    }
}
