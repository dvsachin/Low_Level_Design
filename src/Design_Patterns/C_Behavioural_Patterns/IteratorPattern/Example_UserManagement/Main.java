package Design_Patterns.C_Behavioural_Patterns.IteratorPattern.Example_UserManagement;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Dhoni","100"));
        userManagement.addUser(new User("Virat","150"));
        userManagement.addUser(new User("Rohit","120"));
        userManagement.addUser(new User("Sachin","200"));

        MyIterator iterator = userManagement.getIterator();

        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("name: "+user.getName());
        }
    }
}
