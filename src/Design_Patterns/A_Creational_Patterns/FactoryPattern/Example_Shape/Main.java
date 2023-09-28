package Design_Patterns.A_Creational_Patterns.FactoryPattern.Example_Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
    }
}


