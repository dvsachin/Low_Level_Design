package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy.SportDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportDriveStrategy());
    }
}
