package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("RED color filled");
    }
}
