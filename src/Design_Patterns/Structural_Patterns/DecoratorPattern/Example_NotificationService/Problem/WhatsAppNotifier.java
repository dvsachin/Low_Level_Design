package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_NotificationService.Problem;

public class WhatsAppNotifier extends Notifier{
    WhatsAppNotifier(String username) {
        super(username);
    }
    @Override
    public void send(String msg) {
        String mob = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending: "+msg+" by WhatsApp on: "+mob);
    }
}
