package Design_Patterns.Structural_Patterns.FacadePattern.Example_OrderProduct;

public class OderFacade {
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;

    public OderFacade() {
        productDao = new ProductDao();
        invoice = new Invoice();
        payment = new Payment();
        sendNotification = new SendNotification();
    }
    public  void createOrder() {
        Product product = productDao.getProduct(100);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();
        // order creation successfully
    }
}
