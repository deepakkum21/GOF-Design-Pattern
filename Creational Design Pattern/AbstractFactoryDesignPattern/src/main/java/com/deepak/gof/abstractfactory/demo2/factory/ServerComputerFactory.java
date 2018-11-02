package com.deepak.gof.abstractfactory.demo2.factory;

import com.deepak.gof.abstractfactory.demo2.computer.IComputer;
import com.deepak.gof.abstractfactory.demo2.computer.ServerComputer;

public class ServerComputerFactory implements IComputerFactory {

    @Override
    public IComputer createComputer() {
		return new ServerComputer();
	}

}