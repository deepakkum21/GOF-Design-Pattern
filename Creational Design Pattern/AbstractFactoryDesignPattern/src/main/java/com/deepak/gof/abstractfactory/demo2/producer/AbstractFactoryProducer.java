package com.deepak.gof.abstractfactory.demo2.producer;

import com.deepak.gof.abstractfactory.demo2.computer.IComputer;
import com.deepak.gof.abstractfactory.demo2.factory.PersonalComputerFactory;
import com.deepak.gof.abstractfactory.demo2.factory.ServerComputerFactory;

public class AbstractFactoryProducer {
    public static IComputer getComputer (String computerType) {
        if (computerType == null) {
            return null;
        } else if ("PC".equalsIgnoreCase(computerType)) {
            return new PersonalComputerFactory().createComputer();
        } else if ("SEV".equalsIgnoreCase(computerType)) {
            return new ServerComputerFactory().createComputer();
        } 
        return null;
    }
}