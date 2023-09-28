package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public interface SuperFactory {
    Button createButton();
    TextBox createTextBox();
}
