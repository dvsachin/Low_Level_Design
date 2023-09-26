package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }
    public boolean logIn(String email, String password) {
        if(handler.handle(email,password)) {
            System.out.println("Authorization is successful");
            // Do stuff for Authenticated users
            return true;
        }
        return false;
    }
}
