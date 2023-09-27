package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService.strategy;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);

}