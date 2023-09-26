package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Problem;

public class Notifier {
    private final String username;
    protected final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService  = new DatabaseService();

    }
    public void send(String msg) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending: "+msg+" by Mail to: "+mail);
        // but problem came user can be notified not only by email
        // but also whatsApp or facebook, instagram

        // use an Inheritance - extends Notifier class
        //  clients can currently choose a single notification method
        // but if in future client - requested that
        // why I can't be notified via WhatsApp and Facebook at the same time
        // then we can we define a new class WhatsAppANDFacebookNotifier extends Notifier
        // It will lead to all-possible-notifier classes and bundled-up code
        /*
        Notifier => WhatsApp, Facebook, Instagram, Mail, SMS -
        then we have to create all possible combinations classes which extends Notifier
         */
    }
    public String getUsername(){
        return username;
    }
}
