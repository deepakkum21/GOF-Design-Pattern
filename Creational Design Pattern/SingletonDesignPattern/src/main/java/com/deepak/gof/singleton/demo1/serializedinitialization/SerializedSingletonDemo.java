package com.deepak.gof.singleton.demo1.serializedinitialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class SerializedSingletonDemo {

    public static void main(String... args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton firstInstSingleton = SerializedSingleton.getSerializedSingletonInstance();

        ObjectOutput objOutput = new ObjectOutputStream(new FileOutputStream("filename.ser"));

        objOutput.writeObject(firstInstSingleton);
        objOutput.close();

        // deserailize from file to object
        ObjectInput objInput = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) objInput.readObject();
        objInput.close();

        System.out.println("instanceOne hashCode="+firstInstSingleton.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }
}