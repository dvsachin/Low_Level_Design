package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_NotificationService.Problem;

public class FacebookNotifier extends Notifier {
    FacebookNotifier(String username) {
        super(username);
    }
    @Override
    public void send(String msg) {
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending: "+msg+" on Facebook to: "+fbName);
    }

}
