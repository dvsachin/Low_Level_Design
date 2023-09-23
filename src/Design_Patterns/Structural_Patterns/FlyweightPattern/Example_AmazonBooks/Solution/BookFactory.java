package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Solution;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String,BookType> bookTypes = new HashMap<>();

    static BookType getBookType(String type, String distributed, String otherData) {
        if(bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type,distributed,otherData));
        }
        return bookTypes.get(type);
    }


}
