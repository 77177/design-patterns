package com.training.creational.facotry_method;

public class Main {

    public static void main(String[] args) {
        TestClass testClass = TestClass.getObject();

        System.out.println(testClass);
    }
}
