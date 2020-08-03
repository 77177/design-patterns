package com.training.creational.builder;

public class Main {

    public static void main(String[] args) {
        TestClass.Builder builder = new TestClass.Builder();

        TestClass build = builder.setA(1).setB(2).setC(3).setD(4).setE(5).build();

        System.out.println(build);
    }
}
