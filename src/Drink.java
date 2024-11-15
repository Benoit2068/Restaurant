import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Drink implements Product {

    String name;
    double price;
    String type;
    public static List<Drink> drinks = new ArrayList();

    Drink (String name, double price, String type){
        this.name = name;
        this.price = price;
        this.setType(type);
        drinks.add(this);
        ProductList.getInstance().addProduct(this);
    }

    public abstract void setName(String name);

    public abstract void setPrice(double price);

    public abstract String getName();

    public abstract double getPrice();

    public abstract String getType();


    public abstract void setType(String type);

    public void displayDrink(){
        System.out.println("the drink is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
        System.out.println(this.getClass());
    }

    public static Drink findDrink (String name){
        for (Drink drink : drinks){
            if(drink.name.equalsIgnoreCase(name)){
                return drink;
            }
        }
        return null;
    }


    public void exportDrink() {
        try (FileWriter writer = new FileWriter("drink.csv")) {
            writer.append(getName()).append(",").append(getType()).append(",").append(Double.toString(getPrice()));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'exportation de la boisson : " + e.getMessage());
        }
    }


}
