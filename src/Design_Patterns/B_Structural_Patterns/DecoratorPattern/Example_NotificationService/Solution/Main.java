package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public class Main {
    public static void main(String[] args) {
        // Facebook super.send() -> WhatsApp super.send() -> Notifier super.send() => output
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("Zomato")
                )
        );
        notifier.send("Please rate the meal");
        // user will be notified by all-media at the same time
    }
}
