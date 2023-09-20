package designpatterns.demo.strategydesignpattern;

import designpatterns.demo.strategydesignpattern.strategy.DriveStrategy;
import designpatterns.demo.strategydesignpattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
