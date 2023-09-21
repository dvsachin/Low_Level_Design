package Design_Patterns.Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public interface INotifier {
    void send(String msg);
    String getUsername();
}
