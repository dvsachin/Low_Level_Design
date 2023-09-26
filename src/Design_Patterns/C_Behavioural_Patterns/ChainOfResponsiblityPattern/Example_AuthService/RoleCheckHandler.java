package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if(("admin_username").equals(username)) {
            System.out.println("Loading admin page...");
            return true;
        }
        System.out.println("Loading Default page...");
        return handleNext(username,password);
    }
}
