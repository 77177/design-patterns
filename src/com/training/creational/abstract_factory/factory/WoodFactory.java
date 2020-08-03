package com.training.creational.abstract_factory.factory;

import com.training.creational.abstract_factory.products.WoodChair;
import com.training.creational.abstract_factory.products.WoodTable;

public class WoodFactory implements AbstractFactory {

    @Override
    public WoodChair getChair() {
        return new WoodChair();
    }

    protected void ttt(){}

    @Override
    public WoodTable getTable() {
        return new WoodTable();
    }
}
