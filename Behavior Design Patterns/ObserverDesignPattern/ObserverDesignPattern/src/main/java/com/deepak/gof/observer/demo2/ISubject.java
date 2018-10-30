package com.deepak.gof.observer.demo2;

// This interface handles adding, deleting and updating
// all observers 

public interface ISubject {
    void registerObserver(IObserver observer);
    void unRegisterObserver(IObserver observer);
    void notifyObserver();
}