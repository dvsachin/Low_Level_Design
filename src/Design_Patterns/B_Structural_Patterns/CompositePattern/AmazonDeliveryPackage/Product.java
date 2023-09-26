package Design_Patterns.B_Structural_Patterns.CompositePattern.AmazonDeliveryPackage;

public abstract class Product implements Box{
    protected final String title;
    protected final double price;

    Product(String title, Double price) {
        this.title = title;
        this.price = price;
    }

}
