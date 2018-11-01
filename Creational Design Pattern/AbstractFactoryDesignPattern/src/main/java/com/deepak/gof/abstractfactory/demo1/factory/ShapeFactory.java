package com.deepak.gof.abstractfactory.demo1.factory;

import com.deepak.gof.abstractfactory.demo1.color.IColor;
import com.deepak.gof.abstractfactory.demo1.shape.CircleShape;
import com.deepak.gof.abstractfactory.demo1.shape.IShape;
import com.deepak.gof.abstractfactory.demo1.shape.RectangleShape;
import com.deepak.gof.abstractfactory.demo1.shape.SquareShape;

public class ShapeFactory implements AbstractFactory {

    @Override
    public IColor getColor(String colorType) {
        return null;
    }

    @Override
	public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new CircleShape();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new SquareShape();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new RectangleShape();
        }
		return null;
	}

}