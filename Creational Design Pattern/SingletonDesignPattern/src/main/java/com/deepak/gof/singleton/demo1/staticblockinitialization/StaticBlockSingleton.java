package com.deepak.gof.singleton.demo1.staticblockinitialization;

public class StaticBlockSingleton {
    private StaticBlockSingleton() {

    }
    
    private static StaticBlockSingleton staticSingletonInstnce;

    //static block initialization for exception handling
    static {
        try {
            staticSingletonInstnce = new StaticBlockSingleton();
        } catch (Exception exp) {
            throw new RuntimeException("Exception occured in creating singleton static instance");
        }
    }

    public StaticBlockSingleton getStaticSingletonInstance () {
        return staticSingletonInstnce;
    }

}