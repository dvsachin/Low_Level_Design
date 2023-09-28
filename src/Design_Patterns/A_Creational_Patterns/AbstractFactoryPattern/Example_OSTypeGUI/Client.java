package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class Client {
    public static void main(String[] args) {
        SuperFactory macFactory = GUIFactory.getOSTypeFactory("Mac");
        Button macButton = macFactory.createButton();
        TextBox macTextBox = macFactory.createTextBox();
        macButton.Press();
        macTextBox.showText();

        SuperFactory winFactory = GUIFactory.getOSTypeFactory("Win");
        Button winButton = winFactory.createButton();
        TextBox winTextBox = winFactory.createTextBox();
        winButton.Press();
        winTextBox.showText();
    }
}
