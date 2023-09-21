package Design_Patterns.Structural_Patterns.CompositePattern.AmazonDeliveryPackage;

public class VideoGame extends Product{
    public VideoGame(String title, double price){
        super(title,price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
