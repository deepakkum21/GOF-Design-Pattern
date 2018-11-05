package com.deepak.gof.singleton.demo1.eagerinitialization;

public class EagerSingleton {

    //private constructor to avoid client applications to use constructor
    private EagerSingleton() {
    }

    private static EagerSingleton eagerSingletonInstance = new EagerSingleton();

    public static EagerSingleton getSingletonInstance () {
        return eagerSingletonInstance;
    }
}