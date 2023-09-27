package Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany;

import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models.Bank;
import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models.Company;
import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models.Resident;
import Design_Patterns.C_Behavioural_Patterns.VisitorPattern.Example_InsurenceCompany.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}