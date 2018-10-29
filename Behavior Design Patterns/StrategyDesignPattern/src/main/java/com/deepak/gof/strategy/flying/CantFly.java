package com.deepak.gof.strategy.flying;

//Class used if the Animal can't fly
 
public class CantFly implements IFlys{
 
    public String fly() {
        
        return "I can't fly";
        
    }
    
}