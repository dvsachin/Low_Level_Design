package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RoomSensorLights;

public class Room {
    Command command;

    public Room() {}

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }

}
