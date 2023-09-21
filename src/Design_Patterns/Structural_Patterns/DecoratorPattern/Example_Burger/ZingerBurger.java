package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_Burger;

public class ZingerBurger extends Burger{

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }

    @Override
    public double getCost() {
        return 180;
    }
}
