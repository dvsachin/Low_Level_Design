package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_AbstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {

        return switch (shape) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };
    }
    @Override
    Color getColor(String color) {
        return null;
    }
}
