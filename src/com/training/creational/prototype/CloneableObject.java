package com.training.creational.prototype;

public class CloneableObject implements Cloneable {

    private int primitiveInt;
    private Integer integer;
    private A objectA;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneableObject cloneableObject = new CloneableObject();
        cloneableObject.primitiveInt = primitiveInt;
        cloneableObject.integer = new Integer(integer);
        cloneableObject.objectA = new A(this.objectA);
        return cloneableObject;
    }

    private CloneableObject(){

    }

    public static CloneableObject getTestClass(){
        return new CloneableObject();
    }

    public int getPrimitiveInt() {
        return primitiveInt;
    }

    public void setPrimitiveInt(int primitiveInt) {
        this.primitiveInt = primitiveInt;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public A getObjectA() {
        return objectA;
    }

    public void setObjectA(A objectA) {
        this.objectA = objectA;
    }

    @Override
    public String toString() {
        return "IntermediateDecorator{" +
                "primitiveInt=" + primitiveInt +
                ", integer=" + integer +
                '}';
    }
}
