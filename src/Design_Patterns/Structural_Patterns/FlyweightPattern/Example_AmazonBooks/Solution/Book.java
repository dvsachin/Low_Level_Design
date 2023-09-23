package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Solution;
// @Data
public class Book {
    private final String name;
    private final double price;
    private final BookType type;

    public Book(String name, double price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
}

