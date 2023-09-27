package Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models;

import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.Visitor;

public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}