package Design_Patterns.B_Structural_Patterns.DecoratorPattern.Example_NotificationService.Solution;

public abstract class BaseNotifierDecorator  implements INotifier{
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }
    @Override
    public void send(String msg) {
            wrapped.send(msg);
    }
    @Override
    public String getUsername(){
        return wrapped.getUsername();
    }
}
