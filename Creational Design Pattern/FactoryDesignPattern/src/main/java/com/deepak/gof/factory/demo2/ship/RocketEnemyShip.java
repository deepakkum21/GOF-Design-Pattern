package com.deepak.gof.factory.demo2.ship;

public class RocketEnemyShip extends EnemyShip {
    public RocketEnemyShip() {

    }

    @Override
    public String ship() {
        return "Got RocketEnemyShip Constructed";
    }
}