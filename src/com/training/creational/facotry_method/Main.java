package com.training.creational.facotry_method;

public class Main {

    public static void main(String[] args) {
        ObjectWithFactoryMethod objectWithFactoryMethod = ObjectWithFactoryMethod.getObject();

        System.out.println(objectWithFactoryMethod);
    }
}
