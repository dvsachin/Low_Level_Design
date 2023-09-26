package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

// Decorator is using Composition NOT Inheritance
public class Notifier implements INotifier {
    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService  = new DatabaseService();

    }
    @Override
    public void send(String msg) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending: " + msg + " by Mail to: " + mail);
    }
    @Override
    public String getUsername(){
        return username;
    }
}
