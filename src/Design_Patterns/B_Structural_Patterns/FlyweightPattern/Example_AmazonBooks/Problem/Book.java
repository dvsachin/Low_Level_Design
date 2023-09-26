package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Problem;
// @Data
public class Book {
    // 1 char = 2bytes and list of chars = String
    private final  String name;
    private final double price;
    private final String type;
    private final String distributor;
    private final String otherData;

    public Book(String name, double price, String type, String distributor, String otherData) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }
    @Override
    public String toString() {
        return this.name+"---"+this.price;
    }
}
