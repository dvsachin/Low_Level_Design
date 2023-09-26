package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RoomSensorLights;

public class FloorLamp {
    private Light light;

    public FloorLamp() {
        this.light = new Light();
    }
    public void switchLights() {
        light.switchLights();
    }
}
