package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_Pizza;

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
