package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RoomSensorLights;

public class SwitchLightsCommand implements Command {
    private Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLights();
    }

}
