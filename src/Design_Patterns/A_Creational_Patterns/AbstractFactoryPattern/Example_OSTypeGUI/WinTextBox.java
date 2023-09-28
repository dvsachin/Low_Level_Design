package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class WinTextBox implements TextBox{
    @Override
    public void showText() {
        System.out.println("Win-TextBox");
    }
}
