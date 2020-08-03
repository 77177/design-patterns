package com.training.creational.abstract_factory;

import com.training.creational.abstract_factory.factory.AbstractFactory;
import com.training.creational.abstract_factory.factory.WoodFactory;
import com.training.creational.abstract_factory.products.Chair;

public class Main {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new WoodFactory();

        Chair chair = abstractFactory.getChair();

        System.out.println(chair);
    }
}
