package com.deepak.gof.observer.demo2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Uses the ISubject interface to update all Observers

public class StockGrabberSubject implements ISubject {

    private static final Logger logger = LogManager.getLogger(StockGrabberSubject.class);

    private List<IObserver> observerList;
    private double infosysPrice;
    private double hclPrice;
    private double tcsPrice;

    StockGrabberSubject() {
        // Creates an ArrayList to hold all observers
        this.observerList = new ArrayList<>();
    }

    public double getTcsPrice() {
        return tcsPrice;
    }

    public void setTcsPrice(double tcsPrice) {
        this.tcsPrice = tcsPrice;
        notifyObserver();
    }

    
    public double getHclPrice() {
        return hclPrice;
    }

    public void setHclPrice(double hclPrice) {
        this.hclPrice = hclPrice;
        notifyObserver();
    }

    public double getInfosysPrice() {
        return infosysPrice;
    }

    public void setInfosysPrice(double infosysPrice) {
        this.infosysPrice = infosysPrice;
        notifyObserver();
    }

    @Override
    public void registerObserver(IObserver newObserver) {
        // Adds a new observer to the ArrayList
        this.observerList.add(newObserver);
    }

    @Override
    public void unRegisterObserver(IObserver deleteObserver) {
        // Get the index of the observer to delete
        int observerIndex = this.observerList.indexOf(deleteObserver);

        // Print out message (Have to increment index to match)
        logger.info("Observer " + observerIndex + 1 + "deleted");

        // Removes observer from the ArrayList
        this.observerList.remove(deleteObserver);
    }

    @Override
    public void notifyObserver() {
        // Cycle through all observers and notifies them of price changes
        for(IObserver observer: observerList) {
            observer.update(infosysPrice, hclPrice, tcsPrice);
        }
    }

}
