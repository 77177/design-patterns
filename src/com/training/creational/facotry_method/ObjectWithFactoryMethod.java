package com.training.creational.facotry_method;

public class ObjectWithFactoryMethod {

    private int a;

    private ObjectWithFactoryMethod() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "IntermediateDecorator{" +
                "a=" + a +
                '}';
    }

    public static ObjectWithFactoryMethod getObject() {
        return new ObjectWithFactoryMethod();
    }

    public static ObjectWithFactoryMethod getObject(int a) {
        ObjectWithFactoryMethod objectWithFactoryMethod = new ObjectWithFactoryMethod();
        objectWithFactoryMethod.setA(a);
        return objectWithFactoryMethod;
    }
}
