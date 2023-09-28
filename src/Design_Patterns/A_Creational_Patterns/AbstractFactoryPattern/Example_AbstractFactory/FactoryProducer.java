package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getShape(String choice) {
        return switch (choice) {
            case "Shape" -> new ShapeFactory();
            case "Color" -> new ColorFactory();
            default -> null;
        };
    }
}
