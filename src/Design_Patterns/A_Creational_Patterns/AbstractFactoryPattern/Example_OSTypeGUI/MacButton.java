package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class MacButton implements Button{
    @Override
    public void Press() {
        System.out.println("Mac-Button");
    }
}
