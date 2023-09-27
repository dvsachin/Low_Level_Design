package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy.PassengerDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new PassengerDriveStrategy());
    }
}
