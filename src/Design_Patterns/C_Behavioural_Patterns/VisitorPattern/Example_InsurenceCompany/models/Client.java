package Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models;

import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.Visitor;

public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public abstract void accept(Visitor visitor);

}