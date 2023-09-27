package Design_Patterns.C_Behavioural_Patterns.MomentoPattern.ObserverPattern.Example_YoutubeChService;
// Concrete Observer
public class Subscriber implements User {
    String name;

    Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void notified(String title) {
        System.out.println("Hi "+this.name+" :: New Video - "+title);
    }
}
