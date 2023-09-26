package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

public class UserExistHandler extends Handler {
    private Database database;

    public UserExistHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)) {
            System.out.println("This username is NOT registered!");
            System.out.println("Sign up to out App now!");
            return false;
        }
        return handleNext(username,password);
    }
}
