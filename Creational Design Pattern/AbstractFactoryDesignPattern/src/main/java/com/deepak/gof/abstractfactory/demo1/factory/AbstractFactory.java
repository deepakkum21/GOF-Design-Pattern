package com.deepak.gof.abstractfactory.demo1.factory;

import com.deepak.gof.abstractfactory.demo1.color.IColor;
import com.deepak.gof.abstractfactory.demo1.shape.IShape;

public interface AbstractFactory {
    IColor getColor(String colorType);
    IShape getShape(String shapeType);
}