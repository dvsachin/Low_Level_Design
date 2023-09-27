package Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.states;

import Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.Phone;

public class ReadyState extends State {

    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return phone.home();
    }

    @Override
    public String onOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

}