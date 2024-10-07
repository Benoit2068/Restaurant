import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Table  {

    private String client;
    private Date date;
    private String type;
    protected List<Product> ProductsConsumed = new ArrayList<>();


Table (String client, Date date, String type){
    this.client = client;
    this.date = date;
    setType(type);
}

public void setClient(String client){
    this.client = client;
}

public void setDate(Date date){
    this.date = date;
}

public void setType(String type){
    if (type.equalsIgnoreCase("pleasure") || type.equalsIgnoreCase("diet") || type.equalsIgnoreCase("vegan")) {
        this.type = type;
    }
        else{
            System.out.println("This table type doesn't exist");
        }
    }
    public String getClient(){
        return this.client;
    }

    public Date getDate(){
        return this.date;
    }

    public String getType(){
        return this.type;
    }

    public void addProductInProductsConsumedLis(Product product){
        ProductsConsumed.add(product);
    }

    public void removeProductInProductsConsumedList(Product product){
        ProductsConsumed.remove(product);
    }

    public void clearProductInProductsConsumedList(){
        ProductsConsumed.clear();
    }

}

