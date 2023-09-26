package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

public class TurnACOnCommand implements ICommand {
    // Remote-Button
    AirConditioner ac;

    TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
