package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy.NormalDriveStrategy;

public class PersonalVehicle extends Vehicle{
    public PersonalVehicle() {
        super(new NormalDriveStrategy());
    }
}
