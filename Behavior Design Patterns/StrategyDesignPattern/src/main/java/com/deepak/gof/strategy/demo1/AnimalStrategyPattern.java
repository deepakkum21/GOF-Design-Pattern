package com.deepak.gof.strategy.demo1;

import com.deepak.gof.strategy.demo1.flying.ItFlys;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnimalStrategyPattern {

	private static final Logger logger = LogManager.getLogger(AnimalStrategyPattern.class);
	
	public static void main(String[] args){
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		logger.info("Dog: " + sparky.tryToFly());
		
		logger.info("Bird: " + tweety.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		sparky.setFlyingAbility(new ItFlys());
		logger.info("When Changing the flying Ablity of Dog");
		logger.info("Dog: " + sparky.tryToFly());
		
	}
	
}