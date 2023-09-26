package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

public class TurnACOffCommand implements ICommand{
    AirConditioner ac;

    TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
