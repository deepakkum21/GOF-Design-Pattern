package com.deepak.gof.factory.demo1;

import com.deepak.gof.factory.demo1.shape.IShape;
import com.deepak.gof.factory.demo1.shape.impl.CircleShape;
import com.deepak.gof.factory.demo1.shape.impl.RectangleShape;
import com.deepak.gof.factory.demo1.shape.impl.SquareShape;
import com.deepak.gof.factory.demo1.shape.impl.TriangleShape;

public class ShapeFactory {
    public IShape getShape (String shapeType) {
        if (shapeType == null ) {
            return null;
        } else if (("CIRCLE").equalsIgnoreCase(shapeType)) {
            return new CircleShape();
        } else if (("TRIANGLE").equalsIgnoreCase(shapeType)) {
            return new TriangleShape();
        } else if (("SQUARE").equalsIgnoreCase(shapeType)) {
            return new SquareShape();
        } else if (("RECTANGLE").equalsIgnoreCase(shapeType)) {
            return new RectangleShape();
        } 
        return null;
    }
}