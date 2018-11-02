package com.deepak.gof.abstractfactory.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.deepak.gof.abstractfactory.demo2.computer.IComputer;
import com.deepak.gof.abstractfactory.demo2.computer.PersonalComputer;
import com.deepak.gof.abstractfactory.demo2.computer.ServerComputer;
import com.deepak.gof.abstractfactory.demo2.producer.AbstractFactoryProducer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComputerAbstractPatternDemo {
    private static final Logger absFactLogger = LogManager.getLogger(ComputerAbstractPatternDemo.class);
    private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        absFactLogger.info("Enter PC for Personal Computer or SEV for Server Computer");
        IComputer resultComputer = AbstractFactoryProducer.getComputer(bReader.readLine());
        absFactLogger.info("Enter the Hard Disk Capacity you want: ");
        resultComputer.setHDD(bReader.readLine()); 
        absFactLogger.info("Enter the Ram Capacity you want: ");
        resultComputer.setRAM(bReader.readLine()); 
        absFactLogger.info("Enter the Cpu Frequency you want: ");
        resultComputer.setCPU(bReader.readLine()); 
        if(resultComputer instanceof ServerComputer) {
            ServerComputer serverComputer = (ServerComputer)resultComputer;
            absFactLogger.info("Enter the No of Nodes you want to connect: ");
            serverComputer.setNoOfNodesHandle(bReader.readLine());
            absFactLogger.info(serverComputer);
        } else if(resultComputer instanceof PersonalComputer) {
            PersonalComputer pcComputer = (PersonalComputer)resultComputer;
            absFactLogger.info(pcComputer);
        } else {
            absFactLogger.info("Wrong input selected so no Computer Created");
        }
    }
 }