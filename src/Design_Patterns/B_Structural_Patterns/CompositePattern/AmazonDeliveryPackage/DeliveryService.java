package Design_Patterns.B_Structural_Patterns.CompositePattern.AmazonDeliveryPackage;

public class DeliveryService {
    private Box box;

    public DeliveryService() {}

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }
    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
