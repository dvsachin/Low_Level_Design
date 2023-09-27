package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_OnlineInventorySystem;
// // Concrete Observable or Inventory or Channel
public interface Inventory {
    public void add(User user);
    public void remove(User user);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
