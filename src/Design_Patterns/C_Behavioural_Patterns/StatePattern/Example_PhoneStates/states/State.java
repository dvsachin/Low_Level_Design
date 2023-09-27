package Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.states;

import Design_Patterns.C_Behavioural_Patterns.StatePattern.Example_PhoneStates.Phone;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();

}