package com.deepak.gof.factory.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.deepak.gof.factory.demo1.shape.IShape;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeFactoryPatternDemo {

    private static final Logger factorylogger = LogManager.getLogger(ShapeFactoryPatternDemo.class);
    private static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String... args) throws IOException {
        ShapeFactory shapeFactory = new ShapeFactory();

        factorylogger.info("**** Shape Factory menu ****");
        factorylogger.info(" CIRCLE");
        factorylogger.info(" RECTANGLE");
        factorylogger.info(" SQUARE");
        factorylogger.info(" TRIANGLE");
        IShape resultShape = shapeFactory.getShape(bufferReader.readLine());
        factorylogger.info(resultShape.drawShape());
    }


}