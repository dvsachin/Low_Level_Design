package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private final List<Book> books = new ArrayList<>();
    public void storeBook(String name, double price, String type, String distributor, String otherData){
        books.add(new Book(name, price, type, distributor, otherData));
    }
    public void displayBooks() {
        for (Book book : books) {
            // render the book on store website
//            System.out.println(book.toString());
        }
    }
    public String getRandomName() {
        int rnd = new Random().nextInt(BookCONSTANT.listBooks.length);
        return BookCONSTANT.listBooks[rnd];
    }
    public   Double getRandomPrice() {
        int rnd = new Random().nextInt(BookCONSTANT.prices.length);
        return BookCONSTANT.prices[rnd];

    }
}
