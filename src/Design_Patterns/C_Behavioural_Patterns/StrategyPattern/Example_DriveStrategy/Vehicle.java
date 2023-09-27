package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive(); // at runtime will decide
    }
}
