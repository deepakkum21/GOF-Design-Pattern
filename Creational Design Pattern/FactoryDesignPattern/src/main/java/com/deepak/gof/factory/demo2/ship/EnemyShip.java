package com.deepak.gof.factory.demo2.ship;

public abstract class EnemyShip implements IShip{

	private String name;
	private double speed;
	private double amtDamage;

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getDamage() {
		return amtDamage;
	}

	public void setDamage(double newDamage) {
		amtDamage = newDamage;
	}

	public String followHeroShip() {
		return (getName() + " is following the hero at " + getSpeed() + " km/hr ");

	}

	public String displayEnemyShip() {

		return (getName() + " is on the screen ");

	}

	public String enemyShipShoots() {

		return (getName() + " attacks and does " + getDamage() + "% damage to hero ");

	}

    @Override
    public void setShipDetails(String newName, double newSpeed, double newAmtDamage) {
        this.setName(newName);
        this.setSpeed(newSpeed);
        this.setDamage(newAmtDamage);
    }

    @Override
    public String getShipDetails() {
        return this.displayEnemyShip() + this.followHeroShip() + this.enemyShipShoots();
    }

}