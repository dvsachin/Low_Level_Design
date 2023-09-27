package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_YoutubeChService;

import java.util.ArrayList;
import java.util.List;
// Concrete Observable or Inventory or Channel
public class YoutubeChannel implements Subject{
    List<User> subscribers = new ArrayList<>();
    // has an Observer
    @Override
    public void subscribe(User u) {
        this.subscribers.add(u);
    }

    @Override
    public void unsubscribe(User u) {
        this.subscribers.remove(u);
    }

    @Override
    public void notifyChanges(String title) {
        for(User u : this.subscribers) {
            u.notified(title);
        }
        System.out.println("*********************************");
    }
}
