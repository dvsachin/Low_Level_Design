package Design_Patterns.Structural_Patterns.FacadePattern.Example_OrderProduct;


public class ProductDao {
    public Product getProduct(int productId) {
        return new Product();
    }
}
