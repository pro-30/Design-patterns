package designpatterns.demo.strategydesignpattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.print("Sports drive ability");
    }
}
