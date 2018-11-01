package com.deepak.gof.abstractfactory.demo1.factory.producer;

import com.deepak.gof.abstractfactory.demo1.factory.AbstractFactory;
import com.deepak.gof.abstractfactory.demo1.factory.ColorFactory;
import com.deepak.gof.abstractfactory.demo1.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        } else if ("SHAPE".equalsIgnoreCase(factoryType)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(factoryType)) {
            return new ColorFactory();
        }
        return null;
    }
}