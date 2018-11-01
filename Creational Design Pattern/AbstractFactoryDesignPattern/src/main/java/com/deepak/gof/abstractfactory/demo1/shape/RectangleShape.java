package com.deepak.gof.abstractfactory.demo1.shape;

public class RectangleShape implements IShape {

    @Override
    public String draw() {
        return "You Got Rectangle Shape object to Draw";
    }

}