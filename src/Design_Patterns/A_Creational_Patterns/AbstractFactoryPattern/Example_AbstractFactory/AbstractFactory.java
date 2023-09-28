package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
