package Design_Patterns.Structural_Patterns.FacadePattern.Example_BuyCrypto;

public class Main {
    public static void main(String[] args) {
        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptoCurrency(1000,"BTC");
    }
}
