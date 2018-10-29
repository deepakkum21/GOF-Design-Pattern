package com.deepak.gof.strategy.flying;

import com.deepak.gof.strategy.flying.IFlys;

// Class used if the Animal can fly
 
public class ItFlys implements IFlys{
 
    public String fly() {
        
        return "Flying High";
        
    }
    
}