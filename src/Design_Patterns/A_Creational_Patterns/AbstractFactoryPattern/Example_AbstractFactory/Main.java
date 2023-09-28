package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = FactoryProducer.getShape("Shape");
        AbstractFactory abstractFactory2 = FactoryProducer.getShape("Color");

        Shape shape1 = abstractFactory1.getShape("Circle");
        shape1.draw();

        Color color = abstractFactory2.getColor("Red");
        color.fill();
    }
}


