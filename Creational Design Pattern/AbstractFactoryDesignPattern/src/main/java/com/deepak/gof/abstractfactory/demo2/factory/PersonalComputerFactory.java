package com.deepak.gof.abstractfactory.demo2.factory;

import com.deepak.gof.abstractfactory.demo2.computer.IComputer;
import com.deepak.gof.abstractfactory.demo2.computer.PersonalComputer;

public class PersonalComputerFactory implements IComputerFactory {

    @Override
    public IComputer createComputer() {
        return new PersonalComputer();
    }

}