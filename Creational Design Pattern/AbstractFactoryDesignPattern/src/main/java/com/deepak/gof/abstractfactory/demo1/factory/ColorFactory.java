package com.deepak.gof.abstractfactory.demo1.factory;

import com.deepak.gof.abstractfactory.demo1.color.BlueColor;
import com.deepak.gof.abstractfactory.demo1.color.GreenColor;
import com.deepak.gof.abstractfactory.demo1.color.IColor;
import com.deepak.gof.abstractfactory.demo1.color.RedColor;
import com.deepak.gof.abstractfactory.demo1.shape.IShape;

public class ColorFactory implements AbstractFactory {

    @Override
    public IColor getColor(String colorType) {
        if (colorType == null) {
            return null;
        } else if ("BLUE".equalsIgnoreCase(colorType)) {
            return new BlueColor();
        } else if ("GREEN".equalsIgnoreCase(colorType)) {
            return new GreenColor();
        } else if ("RED".equalsIgnoreCase(colorType)) {
            return new RedColor();
        }
        return null;
    }

    @Override
	public IShape getShape(String shapeType) {
		return null;
	}

}