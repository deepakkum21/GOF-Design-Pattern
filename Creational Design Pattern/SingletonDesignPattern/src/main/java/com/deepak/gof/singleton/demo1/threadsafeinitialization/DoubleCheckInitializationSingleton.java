package com.deepak.gof.singleton.demo1.threadsafeinitialization;

public class DoubleCheckInitializationSingleton {

    private DoubleCheckInitializationSingleton() {

    }

    private static DoubleCheckInitializationSingleton doubleCheckThreadSafeInstance = null;

    // the synchronized block is used inside the if condition with an additional 
    // check to ensure that only one instance of singleton class is created.
    public static DoubleCheckInitializationSingleton getThreadSafeInstance() {
        if (doubleCheckThreadSafeInstance == null) {
            synchronized (DoubleCheckInitializationSingleton.class) {
                if (doubleCheckThreadSafeInstance == null) {
                    doubleCheckThreadSafeInstance = new DoubleCheckInitializationSingleton();
                }
            }
        }
        return doubleCheckThreadSafeInstance;
    }
}