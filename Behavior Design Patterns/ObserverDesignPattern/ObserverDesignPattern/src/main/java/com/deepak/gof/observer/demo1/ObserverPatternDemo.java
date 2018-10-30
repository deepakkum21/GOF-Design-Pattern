package com.deepak.gof.observer.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverPatternDemo {

    private static final Logger logger = LogManager.getLogger(ObserverPatternDemo.class);
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main (String... args) throws NumberFormatException, IOException {
        ObserverPatternDemo observerPatternDemo = new ObserverPatternDemo();
        
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        logger.info("Enter the state to which you want to change: ");
        int changedState = Integer.parseInt(observerPatternDemo.bufferedReader.readLine());

        subject.setState(changedState);
    }
}