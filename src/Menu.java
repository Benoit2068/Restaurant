import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Menu implements Product {

    protected List<Product> productsInMenu = new ArrayList<>();
    String name;
    String type;

    Menu(){
        ProductList.getInstance().addProduct(this);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void add(Product component){
        productsInMenu.add(component);
    }

    public void remove(Product component){
        productsInMenu.remove(component);
    }

    public void clear(){
        productsInMenu.clear();
    }

    public void displayMenu(){
        System.out.println("In the menu " + name +" there are : ");
        for (int i=0; i < productsInMenu.size(); i++){
            System.out.println(" - " + productsInMenu.get(i).getName());
        }
        System.out.println("Menu Price = " + this.getPrice());
    }

    public double getPrice() {
        double price = 0.00d;
        for (int i = 0; i < productsInMenu.size(); i++) {
            price = price + productsInMenu.get(i).getPrice();
        }
        //price = Math.round(price*.80d);
        return price;
    }

    @Override
    public String getType() {
        return this.getType();
    }


}
