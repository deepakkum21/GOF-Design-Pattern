package com.deepak.gof.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnemyShipTesting {

    private BufferedReader bufferReader;

    EnemyShipTesting() {
        bufferReader = new BufferedReader(new InputStreamReader(System.in));
        
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        EnemyShipTesting enemyShipTesting = new EnemyShipTesting();
        int choice;

        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        System.out.println("1. UFO");
        System.out.println("2. UFO BOSS");
        System.out.println("3. ROCKET");
        System.out.println("Enter the Type of Ship you want to make");
        choice = Integer.parseInt(enemyShipTesting.bufferReader.readLine());

        switch (choice) {
        case 1:
        System.out.println("theGrunt" + "\n");
            EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
            System.out.println(theGrunt + "\n");
            break;

        case 2:
            EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
            System.out.println(theBoss + "\n");
            break;

        case 3:
            System.out.println("The Rocket is in Factory and will take time to be built" + "\n Construction Under Progress.......... \n Thanks for your patience \n");
            break;

        default:
            System.out.println("wrong choice entered" + "\n");
        }

    }

}

abstract class EnemyShipBuilding {

    // This acts as an ordering mechanism for creating
    // EnemyShips that have a weapon, engine & name
    // & nothing else

    // The specific parts used for engine & weapon depend
    // upon the String that is passed to this method

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    // When called a new EnemyShip is made. The specific parts
    // are based on the String entered. After the ship is made
    // we execute multiple methods in the EnemyShip Object

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;

    }
}

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO
        // needs. The EnemyShip object is returned & given a name

        if (typeOfShip.equals("UFO")) {
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else

        // If UFO BOSS was sent grab use the factory that knows
        // what types of weapons and engines a Boss UFO
        // needs. The EnemyShip object is returned & given a name

        if (typeOfShip.equals("UFO BOSS")) {
            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");

        }

        return theEnemyShip;
    }
}

// With an Abstract Factory Pattern you won't
// just build ships, but also all of the components
// for the ships

// Here is where you define the parts that are required
// if an object wants to be an enemy ship

interface EnemyShipFactory {

    public ESWeapon addESGun();

    public ESEngine addESEngine();

}

// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

class UFOEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}

// This factory uses the EnemyShipFactory interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

class UFOBossEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }

}

abstract class EnemyShip {

    private String name;

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts
    // in UFOEnemyShipFactory or UFOBossEnemyShipFactory

    ESWeapon weapon;
    ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    abstract void makeShip();

    // Because I defined the toString method in engine
    // when it is printed the String defined in toString goes
    // on the screen

    public void followHeroShip() {

        System.out.println(getName() + " is following the hero at " + engine);

    }

    public void displayEnemyShip() {

        System.out.println(getName() + " is on the screen");

    }

    public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + weapon);

    }

    // If any EnemyShip object is printed to screen this shows up

    public String toString() {

        String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;

        return infoOnShip;

    }

}

class UFOEnemyShip extends EnemyShip {

    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships

    EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a regular UFO versus a Boss UFO

    public UFOEnemyShip(EnemyShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOEnemyShip

    void makeShip() {

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }

}

class UFOBossEnemyShip extends EnemyShip {

    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships

    EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a Boss UFO versus a Regular UFO

    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {

        this.shipFactory = shipFactory;

    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOBossEnemyShip

    void makeShip() {

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOBossEnemyShip here

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();

    }

}

// Any part that implements the interface ESEngine
// can replace that part in any ship

interface ESEngine {

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}

// Any part that implements the interface ESWeapon
// can replace that part in any ship

interface ESWeapon {

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed

    public String toString();

}

// Here we define a basic component of a space ship
// Any part that implements the interface ESWeapon
// can replace that part in any ship

class ESUFOGun implements ESWeapon {

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString() {
        return "20 damage";
    }

}

// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

class ESUFOEngine implements ESEngine {

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString() {
        return "1000 mph";
    }

}

// Here we define a basic component of a space ship
// Any part that implements the interface ESWeapon
// can replace that part in any ship

class ESUFOBossGun implements ESWeapon {

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString() {
        return "40 damage";
    }

}

// Here we define a basic component of a space ship
// Any part that implements the interface ESEngine
// can replace that part in any ship

class ESUFOBossEngine implements ESEngine {

    // EnemyShip contains a reference to the object
    // ESWeapon. It is stored in the field weapon

    // The Strategy design pattern is being used here

    // When the field that is of type ESUFOGun is printed
    // the following shows on the screen

    public String toString() {
        return "2000 mph";
    }

}