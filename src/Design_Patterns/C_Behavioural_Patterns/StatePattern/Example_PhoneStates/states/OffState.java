package Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.states;

import Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.Phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

}