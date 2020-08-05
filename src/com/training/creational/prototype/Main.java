package com.training.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableObject cloneableObject = CloneableObject.getTestClass();
        cloneableObject.setPrimitiveInt(1);
        cloneableObject.setInteger(2);
        cloneableObject.setObjectA(new A());

        CloneableObject clone = (CloneableObject) cloneableObject.clone();

        clone.setPrimitiveInt(123);
        clone.setInteger(123);
        clone.getObjectA().setA(10000);
        System.out.println(clone);
        System.out.println(cloneableObject);

    }
}
