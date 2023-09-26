package Design_Patterns.C_Behavioural_Patterns.CommandPattern.Example_RemoteControl;

public class AirConditioner {
    // Receiver
    boolean isOn;
    int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("AC is ON");
    }
    public void turnOffAC() {
        isOn = false;
        System.out.println("AC is OFF");
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is changed to : "+temperature);
    }

}
