package com.deepak.gof.singleton.demo1.serializedinitialization;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private SerializedSingleton() {

    }

    private static class SerializedInnnerClass {
        private static final SerializedSingleton SERIALIZED_SINGLETON_INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getSerializedSingletonInstance() {
        return SerializedInnnerClass.SERIALIZED_SINGLETON_INSTANCE;
    }

    // if not implemented then both the instance of serialize and deserialize will have different hashCode
    protected Object readResolve() {
        return getSerializedSingletonInstance();
    }
}
