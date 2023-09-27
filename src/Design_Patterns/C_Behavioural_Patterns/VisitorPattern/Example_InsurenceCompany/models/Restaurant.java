package Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models;

import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.Visitor;

public class Restaurant extends Client {

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}