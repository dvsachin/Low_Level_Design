package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

import java.util.Stack;

public class MyRemoteControl {
    // Invoker
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    MyRemoteControl() {}

    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
        acCommandHistory.push(command);
    }
    public void undo() {
        if (!acCommandHistory.isEmpty()) {
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo(); // Concrete command undo method - type of command (ON | OFF) last command had
        }
    }

}
