package com.training.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton(){
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
