package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_StoreNotifyService;

public record EmailMsgListener(String email) implements Listener {
    @Override
    public void update(Event eventType) {
        // Actually send the mail
        System.out.println("Sending mail to " + email + " concerning " + eventType);
    }

}