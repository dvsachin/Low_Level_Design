package Design_Patterns.A_Creational_Patterns.AbstractFactoryPattern.Example_OSTypeGUI;

public class GUIFactory {
    public static SuperFactory getOSTypeFactory(String osType) {
        return switch (osType) {
            case "Mac" -> new MacFactory();
            case "Win" -> new WinFactory();
            default -> null;
        };
    }
}
