package designpatterns.demo.strategydesignpattern;

import designpatterns.demo.strategydesignpattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
