package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_DriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new PersonalVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new GoodsVehicle();
        vehicle3.drive();
    }
}
