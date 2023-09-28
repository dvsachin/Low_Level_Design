package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        return switch (color) {
            case "Red" -> new Red();
            case "Green" -> new Green();
            case "Blue" -> new Blue();
            default -> null;
        };
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
