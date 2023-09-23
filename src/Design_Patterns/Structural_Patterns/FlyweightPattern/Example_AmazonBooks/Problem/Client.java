package Design_Patterns.Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Problem;

public class Client {
    private static final int BOOK_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10_000_000_0;
    public static void main(String[] args) {

        System.out.println("Started @ :: CONSUMED-MEMORY : "+ ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024));
//        System.out.println("TOTAL-MEMORY : "+ (Runtime.getRuntime().totalMemory())/1024);
        Store store = new Store();

        for (int i=0; i<BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            store.storeBook(store.getRandomName(), store.getRandomPrice(),
                    "Action", "Follett", "Stuff");

            store.storeBook(store.getRandomName(), store.getRandomPrice(),
                    "Fantasy", "Ingram", "Extra");
        }
        store.displayBooks();
        System.out.println("-----------------------------------");
        System.out.println("Stopped @ :: CONSUMED-MEMORY : "+ ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1024));
//        System.out.println("TOTAL-MEMORY : "+ (Runtime.getRuntime().totalMemory())/1024);

    }


}
