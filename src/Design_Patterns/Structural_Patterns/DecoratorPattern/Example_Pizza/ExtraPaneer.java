package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_Pizza;

public class ExtraPaneer extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraPaneer(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
