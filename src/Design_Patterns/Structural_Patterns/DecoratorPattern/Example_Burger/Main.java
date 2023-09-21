package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_Burger;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription()+"---"+burger.getCost());

        burger = new ExtraCheeseBurger(burger); // on top of zinger
        System.out.println(burger.getDescription()+"---"+burger.getCost());

        burger = new ExtraMayoBurger(burger); // on top of cheese
        System.out.println(burger.getDescription()+"---"+burger.getCost());
    }
}
