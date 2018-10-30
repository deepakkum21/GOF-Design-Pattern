package com.deepak.gof.observer.demo2;

// The Observers update method is called when the Subject changes

public interface IObserver {
    void update(double infosysPrice, double hclPrice, double tcsPrice);
}