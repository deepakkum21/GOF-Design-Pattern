package com.deepak.gof.observer.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StockObserverPatternDemo {

    private static final Logger logger = LogManager.getLogger(StockObserverPatternDemo.class);
    private BufferedReader bufferReader;

    StockObserverPatternDemo() {
        this.bufferReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void main(String... arg) throws NumberFormatException, IOException {
        StockObserverPatternDemo observerPatternDemo = new StockObserverPatternDemo();

        StockGrabberSubject sGrabberSubject = new StockGrabberSubject();

        StockObserver stockObserver = new StockObserver(sGrabberSubject);

        logger.info("Enter the new StockPrice value for Infosys: ");
        sGrabberSubject.setInfosysPrice(Double.parseDouble(observerPatternDemo.bufferReader.readLine()));

        logger.info("Enter the new StockPrice value for Hcl: ");
        sGrabberSubject.setHclPrice(Double.parseDouble(observerPatternDemo.bufferReader.readLine()));

        logger.info("Enter the new StockPrice value for Tcs: ");
        sGrabberSubject.setTcsPrice(Double.parseDouble(observerPatternDemo.bufferReader.readLine()));

        sGrabberSubject.unRegisterObserver(stockObserver);
    }

}