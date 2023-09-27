package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_OnlineInventorySystem;
// // ObserverConcrete
public class MobileUserType implements User{

    String username;
    Inventory inventory;

    public MobileUserType(String username, Inventory inventory) {
        this.username = username;
        this.inventory = inventory;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in Stock - Hurry!");
    }

    private void sendMsgOnMobile(String username, String s) {
        System.out.println("msg sent to : "+username);
    }
}
