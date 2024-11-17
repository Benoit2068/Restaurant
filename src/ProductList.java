import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static List<Product> productList = new ArrayList<>();
    private static ProductList instance = null;

    private ProductList(){};


    public final synchronized static ProductList getInstance(){
        if (ProductList.instance == null){
            ProductList.instance = new ProductList();
        }
        return ProductList.instance;
    }

    void addProduct(Product product){
        productList.add(product);
    }

    public List<Product> getProducts(){
        return productList;
    }
}
