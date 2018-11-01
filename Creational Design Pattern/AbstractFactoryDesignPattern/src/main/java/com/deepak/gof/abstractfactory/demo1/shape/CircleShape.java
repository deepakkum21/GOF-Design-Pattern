package com.deepak.gof.abstractfactory.demo1.shape;

public class CircleShape implements IShape {

    @Override
    public String draw() {
        return "You Got Circle Shape object to Draw";
    }

}