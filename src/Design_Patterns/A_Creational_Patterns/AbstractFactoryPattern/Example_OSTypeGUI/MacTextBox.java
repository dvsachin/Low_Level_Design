package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class MacTextBox implements TextBox{
    @Override
    public void showText() {
        System.out.println("Mac-TextBox");
    }
}
