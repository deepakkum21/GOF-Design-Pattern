package com.deepak.gof.observer.demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StockObserver implements IObserver {

    private static final Logger logger = LogManager.getLogger(StockObserver.class);

    private double infosysPrice;
    private double hclPrice;
    private double tcsPrice;

    private ISubject stockGrabberSubject;
    // Static used as a counter
    private static int observerIDTracker = 0;
    // Static used as a counter
    private int ObserverId;

    StockObserver(ISubject newStockGrabberSubject) {
        // Store the reference to the stockGrabber object so I can make calls to its
        // methods
        this.stockGrabberSubject = newStockGrabberSubject;

        observerIDTracker++;
        this.ObserverId = observerIDTracker;

        // Add the observer to the Subjects ArrayList by registering it
        this.stockGrabberSubject.registerObserver(this);
    }

    // Called to update all observers
    @Override
    public void update(double newInfosysPrice, double newHclPrice, double newTcsPrice) {
        this.infosysPrice = newInfosysPrice;
        this.hclPrice = newHclPrice;
        this.tcsPrice = newTcsPrice;

        printNewUpdatedPrices();
    }

    private void printNewUpdatedPrices() {
        logger.info("Updated Prices of ObserverId: " + this.ObserverId + "\nINFOYS: " + this.infosysPrice + "\nHCL: "
                + this.hclPrice + "\nTCS: " + this.tcsPrice);
    }

}