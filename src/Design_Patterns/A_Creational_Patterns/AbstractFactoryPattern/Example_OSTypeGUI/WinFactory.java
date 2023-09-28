package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class WinFactory implements SuperFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WinTextBox();
    }
}
