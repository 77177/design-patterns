package com.training.creational.abstract_factory.factory;

import com.training.creational.abstract_factory.products.Chair;
import com.training.creational.abstract_factory.products.Table;

public interface AbstractFactory {

    Chair getChair();

    Table getTable();
}
