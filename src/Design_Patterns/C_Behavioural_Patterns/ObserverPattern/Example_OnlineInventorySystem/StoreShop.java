package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_OnlineInventorySystem;

public class StoreShop {
    public static void main(String[] args) {
        Inventory iphoneStock = new IphoneStock();

        User user1 = new EmailUserType("abc@gmail.com", iphoneStock);
        User user2 = new EmailUserType("xyz@gmail.com", iphoneStock);
        User user3 = new MobileUserType("dv_mike", iphoneStock);

        iphoneStock.add(user1);
        iphoneStock.add(user2);
        iphoneStock.add(user3);

        iphoneStock.setStockCount(10);

    }
}
// Asked in Walmart
