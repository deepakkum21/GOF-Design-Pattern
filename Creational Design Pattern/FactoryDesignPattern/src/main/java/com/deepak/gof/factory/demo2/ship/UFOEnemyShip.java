package com.deepak.gof.factory.demo2.ship;

public class UFOEnemyShip extends EnemyShip {
    public UFOEnemyShip() {

    }

    @Override
    public String ship() {
        return "Got UFOEnemyShip Constructed";
    }
}