package com.deepak.gof.observer.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ConversionObserver> observers = new ArrayList<ConversionObserver>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attachObserver( ConversionObserver observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (ConversionObserver observer : observers) {
            observer.update();
        }
    }
}