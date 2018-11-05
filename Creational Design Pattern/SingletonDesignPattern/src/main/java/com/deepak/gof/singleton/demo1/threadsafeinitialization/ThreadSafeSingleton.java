package com.deepak.gof.singleton.demo1.threadsafeinitialization;

public class ThreadSafeSingleton {

    private ThreadSafeSingleton() {

    }

    private static ThreadSafeSingleton threadSafeSingletonInstance = null;

    // drawback - it reduces the performance because of cost associated with the synchronized method 
    // instead use DOUBLE CHECKED THREAD SAFE INITIALIZATION
    public static synchronized ThreadSafeSingleton getThreadSafeInstance () {
        if (threadSafeSingletonInstance == null ) {
            threadSafeSingletonInstance = new ThreadSafeSingleton();
        }
        return threadSafeSingletonInstance;
    }
}