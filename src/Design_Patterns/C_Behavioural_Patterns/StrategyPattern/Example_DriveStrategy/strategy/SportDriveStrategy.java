package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy;

public class SportDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Fast-Highway Racing Driver");
    }
}
