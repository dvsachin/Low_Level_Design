package Design_Patterns.B_Structural_Patterns.FlyweightPattern.Example_AmazonBooks.Solution;
// @Getter
// @AllArgsConstructor
public class BookType {
    // shared data of book
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }
}
