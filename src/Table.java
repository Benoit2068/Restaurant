import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table  {

    private String client;
    private LocalDate date;
    private String type;
    protected List<Product> productsConsumed = new ArrayList();
    Boolean closed = false;


Table (String client, LocalDate date, String type){
    this.client = client;
    this.date = date;
    setType(type);
}

public void setClient(String client){
    this.client = client;
}

public void setDate(LocalDate date){
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

    public LocalDate getDate(){
        return this.date;
    }

    public String getType(){
        return this.type;
    }

    public void addProductInProductsConsumedList(Product product){
        productsConsumed.add(product);
    }

    public void removeProductInProductsConsumedList(Product product){
        productsConsumed.remove(product);
    }

    public void clearProductInProductsConsumedList(){
        productsConsumed.clear();
    }

    public double calculateBill(){
    double billAmount = 0;
    for (Product product : this.productsConsumed){
        billAmount = (billAmount + product.getPrice());
        }
        return billAmount;
    }

    public void printBillTable(){
        System.out.println("Poducts list : ");
        for (Product product : this.productsConsumed){
            System.out.println(product.getName() +" Price : " + product.getPrice() + " CHF");
        }
        System.out.println("total Amount = " + this.calculateBill());
    }
}

