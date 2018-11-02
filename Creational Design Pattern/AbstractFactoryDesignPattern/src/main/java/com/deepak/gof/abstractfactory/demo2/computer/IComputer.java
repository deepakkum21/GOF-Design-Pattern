package com.deepak.gof.abstractfactory.demo2.computer;

public interface IComputer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    public abstract void setRAM(String newRam);
    public abstract void setHDD(String newHDD);
    public abstract void setCPU(String newCpu);
}