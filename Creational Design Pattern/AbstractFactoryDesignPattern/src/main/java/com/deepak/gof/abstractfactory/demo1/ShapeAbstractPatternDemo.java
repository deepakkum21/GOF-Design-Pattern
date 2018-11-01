package com.deepak.gof.abstractfactory.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.deepak.gof.abstractfactory.demo1.color.IColor;
import com.deepak.gof.abstractfactory.demo1.factory.AbstractFactory;
import com.deepak.gof.abstractfactory.demo1.factory.ColorFactory;
import com.deepak.gof.abstractfactory.demo1.factory.ShapeFactory;
import com.deepak.gof.abstractfactory.demo1.factory.producer.FactoryProducer;
import com.deepak.gof.abstractfactory.demo1.shape.IShape;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeAbstractPatternDemo {
    private static final Logger absFactoryLogger = LogManager.getLogger(ShapeAbstractPatternDemo.class);
    private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        absFactoryLogger.info("Enter COLOR or SHAPE for Abstract Factory Demo");

        // get shape factory
        AbstractFactory absFactory = FactoryProducer.getFactory(bReader.readLine());

        if(absFactory instanceof ColorFactory) {
            absFactoryLogger.info("Enter RED or BLUE or GREEN for Creating Color Object");
            IColor color = absFactory.getColor(bReader.readLine());
            absFactoryLogger.info(color.fillColor());
        } else if (absFactory instanceof ShapeFactory) {
            absFactoryLogger.info("Enter CIRCLE or RECTANGLE or SQUARE for Creating Color Object");
            IShape shape = absFactory.getShape(bReader.readLine());
            absFactoryLogger.info(shape.draw());
        } else {
            absFactoryLogger.info("GOT NO OBJECT");
        }

    }
}