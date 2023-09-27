package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy.strategy;

public class PassengerDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Bus | Taxi Driver");
    }
}
