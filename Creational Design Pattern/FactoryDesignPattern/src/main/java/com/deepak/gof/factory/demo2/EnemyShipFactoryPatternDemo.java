package com.deepak.gof.factory.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.deepak.gof.factory.demo2.ship.IShip;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnemyShipFactoryPatternDemo {
    private static final Logger factoryLogger = LogManager.getLogger(EnemyShipFactoryPatternDemo.class);

    private static BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String... args) throws IOException {
        IShip newEnemyShip;
        factoryLogger.info("**** EnemyShip Factory menu ****");
        factoryLogger.info(" U for UFO");
        factoryLogger.info(" R for Rocket");
        factoryLogger.info(" B for BigUFO");
        newEnemyShip = new ShipFactory().getEnemyShip(bReader.readLine());
        
        if (newEnemyShip == null) {
            factoryLogger.info("Please enter correct ship type next time.......");
        } else {
            factoryLogger.info(newEnemyShip.ship());
            setDetails(newEnemyShip);
        }

    }

    private static void setDetails(IShip iShip) throws IOException {
        factoryLogger.info("Enter Details of EnemyShip");
        factoryLogger.info("Enter Name of the ship: ");
        String nameOfShip = bReader.readLine();
        factoryLogger.info("Enter Speed of the ship: ");
        double speedOfShip = Double.parseDouble(bReader.readLine());
        factoryLogger.info("Enter Amount Damaged of the ship: ");
        double amtDamaged = Double.parseDouble(bReader.readLine());
        iShip.setShipDetails(nameOfShip, speedOfShip, amtDamaged);
        factoryLogger.info(iShip.getShipDetails());
    }
}