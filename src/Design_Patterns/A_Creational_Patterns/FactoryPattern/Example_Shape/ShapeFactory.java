package Design_Patterns.A_Creational_Patterns.FactoryPattern.Example_Shape;

public class ShapeFactory {
    public Shape getShape(String shapeType) {

        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };

    }
}
