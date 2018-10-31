package com.deepak.gof.factory.demo2;

import com.deepak.gof.factory.demo2.ship.BigUFOEnemyShip;
import com.deepak.gof.factory.demo2.ship.EnemyShip;
import com.deepak.gof.factory.demo2.ship.RocketEnemyShip;
import com.deepak.gof.factory.demo2.ship.UFOEnemyShip;

public class ShipFactory {
    public EnemyShip getEnemyShip(String shipType) {
        if (shipType == null) {
            return null;
        } else if (("U").equalsIgnoreCase(shipType)) {
            return new UFOEnemyShip();
        } else if (("R").equalsIgnoreCase(shipType)) {
            return new RocketEnemyShip();
        } else if (("B").equalsIgnoreCase(shipType)) {
            return new BigUFOEnemyShip();
        }
        return null;
    }
}