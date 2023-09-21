package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_Burger;

public class ExtraCheeseBurger extends BurgerDecorator {
    private Burger burger; // any type of simple Burger without toppings

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+" with Extra Cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 10; // cheese cost = 10;
    }
}
