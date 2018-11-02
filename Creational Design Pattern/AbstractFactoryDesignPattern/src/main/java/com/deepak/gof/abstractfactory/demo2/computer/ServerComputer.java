package com.deepak.gof.abstractfactory.demo2.computer;

public class ServerComputer implements IComputer {       
    
    private String ram;
    private String hdd;
    private String cpu;

    public ServerComputer() {

    }
    
    private String noOfNodesHandle;
    
    public String getNoOfNodesHandle() {
        return noOfNodesHandle;
    }

    public void setNoOfNodesHandle(String noOfNodesHandle) {
        this.noOfNodesHandle = noOfNodesHandle;
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
        return "Server Computer created With\n" + "RAM= "+this.getRAM()+"GB, HDD= "+this.getHDD()+"GB, CPU= "+this.getCPU()+"GHz, Nodes = "+this.getNoOfNodesHandle();
    }

}