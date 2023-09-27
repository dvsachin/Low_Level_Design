package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService;

import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService.strategy.PaymentByCreditCard;
import Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService.strategy.PaymentByPayPal;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("==========================================");
        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);

    }
}
