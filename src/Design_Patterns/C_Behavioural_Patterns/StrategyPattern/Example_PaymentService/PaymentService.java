package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService.strategy.PaymentStrategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }

}
/*
This class has no visibility on how the payment is being conducted as
it is making use of the strategy interface
 */