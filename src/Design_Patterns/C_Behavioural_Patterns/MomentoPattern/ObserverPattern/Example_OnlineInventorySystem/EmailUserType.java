package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_OnlineInventorySystem;
// // ObserverConcrete
public class EmailUserType implements User{

    String emailId;
    Inventory inventory;

    public EmailUserType(String emailId, Inventory inventory) {
        this.emailId = emailId;
        this.inventory = inventory;
    }

    @Override
    public void update() {
        sendMail(emailId, "product is in Stock - Hurry!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to : "+emailId);
    }
}
