package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_Pizza;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Margherita();
        pizza = new ExtraCheese(pizza);
        System.out.println("Margherita:: Price after cheese addon: "+pizza.cost());

        pizza = new ExtraPaneer(pizza);
        System.out.println("Margherita:: Price after cheese & Panner addon: "+pizza.cost());
    }
}
