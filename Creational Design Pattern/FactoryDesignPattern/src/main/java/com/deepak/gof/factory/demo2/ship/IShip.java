package com.deepak.gof.factory.demo2.ship;

public interface IShip {
    String ship();
    void setShipDetails(String newName, double newSpeed, double newAmtDamage);
    String getShipDetails();
}