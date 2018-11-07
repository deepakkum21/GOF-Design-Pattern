package com.deepak.gof.singleton.demo1.serializedinitialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ObjectInputStream;

public class SerializedSingletonDemo {

    private static final Logger singletonLogger = LogManager.getLogger(SerializedSingletonDemo.class);

    public static void main(String... args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton firstInstSingleton = SerializedSingleton.getSerializedSingletonInstance();

        ObjectOutput objOutput = new ObjectOutputStream(new FileOutputStream("filename.ser"));

        objOutput.writeObject(firstInstSingleton);
        objOutput.close();

        // deserailize from file to object
        ObjectInput objInput = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) objInput.readObject();
        objInput.close();

        singletonLogger.info("instanceOne hashCode="+firstInstSingleton.hashCode());
        singletonLogger.info("instanceTwo hashCode="+instanceTwo.hashCode());
    }
}