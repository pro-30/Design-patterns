package designpatterns.demo.strategydesignpattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.print("Normal driving ability");
    }
}