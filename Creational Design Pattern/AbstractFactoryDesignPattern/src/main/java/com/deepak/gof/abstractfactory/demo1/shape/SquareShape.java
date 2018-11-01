package com.deepak.gof.abstractfactory.demo1.shape;

public class SquareShape implements IShape {

    @Override
    public String draw() {
        return "You Got Square Shape object to Draw";
    }

}