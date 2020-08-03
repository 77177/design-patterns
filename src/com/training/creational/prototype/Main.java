package com.training.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClass testClass = TestClass.getTestClass();
        testClass.setA(1);
        testClass.setB(2);
        testClass.setCls(new A());

        TestClass clone = (TestClass) testClass.clone();

        clone.setA(123);
        clone.setB(123);
        clone.getCls().a = 10000;
        System.out.println(clone);
        System.out.println(testClass);

    }
}
