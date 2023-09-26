package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public class FacebookDecorator extends  BaseNotifierDecorator{
    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }
    @Override
    public void send(String msg) {
        super.send(msg);
        String fbname = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending: "+msg+" on Facebook to: "+fbname);
    }
}
