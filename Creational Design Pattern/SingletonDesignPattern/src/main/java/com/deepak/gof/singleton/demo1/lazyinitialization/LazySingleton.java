package com.deepak.gof.singleton.demo1.lazyinitialization;

public class LazySingleton {
    private static LazySingleton lazySingletonInstance = null;

    private LazySingleton() {

    }

    // best way of implementing Singleton but for single threaded environment
    // not good for multi-thtreaded environment
    public static LazySingleton getLazySingletonInstance() {
        if (lazySingletonInstance == null) {
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }
}