package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Database database = new Database();

        Handler handler = new UserExistHandler(database)
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);
        authService.logIn("admin_username","admin_password");
    }
}
