package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

public class Client {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl acRemote = new MyRemoteControl();

        acRemote.setCommand(new TurnACOnCommand(airConditioner));
        acRemote.pressButton();

        acRemote.undo(); // undo the last operation - whatever its

        // <Client -> MyRemoteControl of setCommand (Invoker) -> particular Command -> Receiver AirConditioner>
        // if any of the command modify then it simply modifies that Command-Class (is-a command)
        // invoker has a command - Remote
        // same remote can be used to use different appliances (have concrete command class)

    }
}
// Resolved Lack of Abstraction
// Difficulty in code Maintenance is easy
// Undo-redo functionality using stack-history
