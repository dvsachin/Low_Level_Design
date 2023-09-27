package Design_Patterns.C_Behavioural_Patterns.StrategyPattern.Example_PaymentService;

public class CreditCard {

    private int amount = 1_000;
    private final String number;
    private final String date;
    private final String cvv;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CreditCard(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}