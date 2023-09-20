package designpatterns.demo.strategydesignpattern;

import designpatterns.demo.strategydesignpattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDriveStrategy()); // we are passing sports drive strategy to Vehicle class constructor.
    }
}
