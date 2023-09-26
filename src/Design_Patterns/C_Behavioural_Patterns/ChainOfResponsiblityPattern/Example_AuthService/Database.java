package Design_Patterns.C_Behavioural_Patterns.ChainOfResponsiblityPattern.Example_AuthService;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("user_username","user_password");
        users.put("admin_username","admin_password");
    }
    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }
    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }

}
