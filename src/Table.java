import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Table  {

    private String client;
    private LocalDate date;
    private String type;
    protected List<Product> productsConsumed = new ArrayList();
    double billAmount = 0;
    private TableState tableState;
    private List<Observator> observators = new ArrayList<>();

    Table(){
    }

Table (String client, LocalDate date, String type){
    this.client = client;
    this.date = date;
    setType(type);
    this.tableState = new TableReserved(this);
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

    public void changeTableState (TableState tableState){
        this.tableState = tableState;
    }

    public TableState getTableState(){
        return this.tableState;
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
        System.out.println("Amount = " + this.calculateBill());
    }

    public void welcomeClient(){
        tableState.welcomeClient(this);
    }

    public void serveProduct(){
        tableState.serveProduct(this);
    }

    public void closedTable(){
        tableState.closeTable(this);
    }

    public void displayTable(){
        tableState.displayTable(this);
    }

    public void addObservator(Observator observator){
        observators.add(observator);
    }

    public void removeObsevator(Observator observator){
        observators.remove(observator);
    }

    public void notifyObservator(){
        for(Observator observator : observators){
            observator.update(this);
        }
    }

    public void closed(){
        notifyObservator();
}


}

