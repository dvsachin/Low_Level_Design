package Design_Patterns.C_Behavioural_Patterns.ObserverPattern.Example_YoutubeChService;

public interface Subject {
    void subscribe(User u);
    void unsubscribe(User u);
    void notifyChanges(String title);
}
