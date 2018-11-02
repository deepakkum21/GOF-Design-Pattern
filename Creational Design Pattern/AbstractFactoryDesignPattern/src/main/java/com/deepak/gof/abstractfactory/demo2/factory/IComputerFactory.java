package com.deepak.gof.abstractfactory.demo2.factory;

import com.deepak.gof.abstractfactory.demo2.computer.IComputer;

public interface IComputerFactory {
    IComputer createComputer();
}