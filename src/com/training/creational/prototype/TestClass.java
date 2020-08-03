package com.training.creational.prototype;

public class TestClass implements Cloneable {

    private int a;
    private Integer b;
    private A cls;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestClass testClass = new TestClass();
        testClass.a = a;
        testClass.b = new Integer(b);
        testClass.cls = new A(this.cls);
        return testClass;
    }

    private TestClass(){

    }

    public static TestClass getTestClass(){
        return new TestClass();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public A getCls() {
        return cls;
    }

    public void setCls(A cls) {
        this.cls = cls;
    }

    @Override
    public String toString() {
        return "TestClassDecorator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
