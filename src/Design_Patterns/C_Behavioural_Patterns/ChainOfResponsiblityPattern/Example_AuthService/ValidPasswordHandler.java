package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

public class ValidPasswordHandler extends Handler{
    Database database;

    ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidPassword(username, password)) {
            System.out.println("Wrong Password ");
            return  false;
        }
        return handleNext(username,password);
    }
}
