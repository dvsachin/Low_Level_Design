package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal City Driver");
    }
}
