package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RoomSensorLights;

public class Light {
    private boolean switchOn;
    public void switchLights() {
        switchOn = !switchOn;
    }

}
