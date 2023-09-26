package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public class WhatsAppDecorator extends  BaseNotifierDecorator{
    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void send(String msg) {
        super.send(msg);
        String mob = databaseService.getPhoneNumberFromUsername(getUsername());
        System.out.println("Sending: "+msg+" by WhatsApp on: "+mob);
    }

}
