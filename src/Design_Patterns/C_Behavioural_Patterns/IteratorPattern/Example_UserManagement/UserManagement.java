package Design_Patterns.C_Behavioural_Patterns.IteratorPattern.Example_UserManagement;

import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> usersList = new ArrayList<>();

    public void addUser(User user) {
        usersList.add(user);
    }
    public User getUser(int index) {
        return usersList.get(index);
    }
    public MyIterator getIterator() {
        return new MyIteratorImpl(usersList);
    }

}
