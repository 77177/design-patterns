package com.training.creational.facotry_method;

public class TestClass {

    private int a;

    private TestClass() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "a=" + a +
                '}';
    }

    public static TestClass getObject() {
        return new TestClass();
    }

    public static TestClass getObject(int a) {
        TestClass testClass = new TestClass();
        testClass.setA(a);
        return testClass;
    }
}
