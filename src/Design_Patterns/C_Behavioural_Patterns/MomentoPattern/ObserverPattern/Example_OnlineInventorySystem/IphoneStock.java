package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_OnlineInventorySystem;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements Inventory{
    public List<User> usersList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(User user) {
        usersList.add(user);
    }

    @Override
    public void remove(User user) {
        usersList.remove(user);
    }

    @Override
    public void notifySubscribers() {
        for (User user : usersList) {
            user.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
