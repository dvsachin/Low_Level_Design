package Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.states;

import Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.Phone;

public class LockedState extends State {

    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

}