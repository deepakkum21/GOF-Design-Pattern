package com.deepak.gof.observer.demo1;

public abstract class ConversionObserver {
    protected Subject subject;
    public abstract void update();
}