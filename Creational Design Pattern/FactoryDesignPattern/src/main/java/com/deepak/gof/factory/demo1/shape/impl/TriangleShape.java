package com.deepak.gof.factory.demo1.shape.impl;

import com.deepak.gof.factory.demo1.shape.IShape;

public class TriangleShape implements IShape {

    @Override
    public String drawShape() {
        return "you have got Triangle Object";
    }

}