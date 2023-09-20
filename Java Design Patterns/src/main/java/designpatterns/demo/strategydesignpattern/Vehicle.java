package designpatterns.demo.strategydesignpattern;

import designpatterns.demo.strategydesignpattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObject){
        // now whatever drive strategy we will get here, that will be assigned to vehicle for eg:
        // here was can get any of normal of sports drive strategy depending on what vehicle is inheriting
        // this parent vehicle class eg: if SportsVehicle is being initialized it will send an object of
        // SportsDriveStrategy to this constructor.

        this.driveObject = driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}
