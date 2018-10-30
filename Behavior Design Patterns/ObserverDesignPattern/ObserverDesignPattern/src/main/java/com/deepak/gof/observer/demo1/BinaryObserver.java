package com.deepak.gof.observer.demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinaryObserver extends ConversionObserver {

    private static final Logger logger = LogManager.getLogger(BinaryObserver.class);

    BinaryObserver(Subject sub) {
        this.subject = sub;
        this.subject.attachObserver(this);
    }

    @Override
    public void update() {
        logger.info("Binary String: " + Integer.toBinaryString(subject.getState()));
    }

}