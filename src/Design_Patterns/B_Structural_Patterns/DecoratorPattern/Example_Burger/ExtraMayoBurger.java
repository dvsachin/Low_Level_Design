package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_Burger;

public class ExtraMayoBurger extends Burger{
    private Burger burger; // any type of simple Burger without toppings

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with Extra Mayo";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 30; // Mayo cost = 30;
    }
}
