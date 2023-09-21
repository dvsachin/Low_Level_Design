package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_Burger;

public abstract class Burger {
    private String description;
    private double cost;
    public abstract String getDescription();
    public abstract double getCost();
}
