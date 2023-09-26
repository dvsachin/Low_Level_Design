package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RoomSensorLights;

public class Main {
    public static void main(String[] args) {
        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(new SwitchLightsCommand(new Light()));
        livingRoom.executeCommand();
    }
}
