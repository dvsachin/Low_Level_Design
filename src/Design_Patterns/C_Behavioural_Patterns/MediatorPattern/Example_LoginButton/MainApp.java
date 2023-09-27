package Design_Patterns.C_Behavioural_Patterns.MediatorPattern.Example_LoginButton;

public class MainApp {
    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();

    }

}