package com.deepak.gof.abstractfactory.demo2.computer;

public class PersonalComputer implements IComputer {        
    
    private String ram;
    private String hdd;
    private String cpu;

    public PersonalComputer() {

    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public void setRAM(String newRam) {
        this.ram = newRam;
    }

    @Override
    public void setHDD(String newHDD) {
        this.hdd = newHDD;
    }

    @Override
    public void setCPU(String newCPU) {
        this.cpu = newCPU;
    }
     
    @Override
    public String toString(){
        return "Personal Computer created With\n" + "RAM= "+this.getRAM()+"GB, HDD= "+this.getHDD()+"GB, CPU="+this.getCPU()  + "GHz";
    }

}