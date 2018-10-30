package com.deepak.gof.observer.demo1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OctalObserver extends ConversionObserver {

    private static final Logger logger = LogManager.getLogger(OctalObserver.class);

    OctalObserver(Subject sub) {
        this.subject = sub;
        this.subject.attachObserver(this);
    }

    @Override
    public void update() {
        logger.info("Octal String: " + Integer.toOctalString(subject.getState()));
    }

}