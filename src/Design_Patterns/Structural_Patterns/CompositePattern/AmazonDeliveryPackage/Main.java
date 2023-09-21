package Design_Patterns.Structural_Patterns.CompositePattern.AmazonDeliveryPackage;

public class Main {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(new VideoGame("1",100)),
                new CompositeBox(
                        new CompositeBox(new Book("2",200),new Book("3",300)
                        ),
                        new VideoGame("4",400),
                        new VideoGame("5",500)
                )
        );
        double packagePrice = deliveryService.calculateOrderPrice();
        System.out.println(packagePrice);
    }

}
