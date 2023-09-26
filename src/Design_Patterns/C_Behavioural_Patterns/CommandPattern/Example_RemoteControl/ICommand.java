package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

public interface ICommand {
    // Command
    public void  execute();
    public  void undo();
}
