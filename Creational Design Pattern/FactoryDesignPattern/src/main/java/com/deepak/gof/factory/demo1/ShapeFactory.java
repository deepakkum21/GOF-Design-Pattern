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
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new CircleShape();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new TriangleShape();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new SquareShape();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RectangleShape();
        } 
        return null;
    }
}