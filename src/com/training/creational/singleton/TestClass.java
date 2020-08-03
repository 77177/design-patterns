package com.training.creational.singleton;

public class TestClass {

    private static TestClass testClass;

    private TestClass(){

    }

    public static TestClass getTestClass(){
        synchronized (TestClass.class) {
            if (testClass == null) {
                testClass = new TestClass();
            }
        }
        return testClass;
    }
}
