import java.util.List;

public interface VendingMachine {

    public void initsProduct(List<Product> productList);
    public Product getProduct(String name);
}

