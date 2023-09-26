package Design_Patterns.B_Structural_Patterns.FacadePattern.Example_OrderProduct;

public class Client {
    public static void main(String[] args) {
        OderFacade orderFacade = new OderFacade();
        orderFacade.createOrder();
        // client always communicate to FacadeOrder and,
        // client doesn't need to know internal complexity of the system or components
    }
}
