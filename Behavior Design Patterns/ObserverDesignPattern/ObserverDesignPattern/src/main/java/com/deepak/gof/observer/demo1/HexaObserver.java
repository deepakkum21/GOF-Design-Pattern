package com.deepak.gof.observer.demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HexaObserver extends ConversionObserver {

    private static final Logger logger = LogManager.getLogger(HexaObserver.class);

    HexaObserver(Subject sub) {
        this.subject = sub;
        this.subject.attachObserver(this);
    }

    @Override
    public void update() {
        logger.info("Hexa String: " + Integer.toHexString(subject.getState()));
    }

}