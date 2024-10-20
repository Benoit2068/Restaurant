import java.util.ArrayList;
import java.util.List;


public abstract class Dish implements Product {
    public String name;
    public double price;
    public String type;
    public static List<Dish> dishes = new ArrayList<>();

    Dish (String name, double price, String type){
        this.name = name;
        this.price= price;
        this.setType(type);
        dishes.add(this);
    }

    public abstract void setName(String name);

    public abstract void setPrice(double price);

    public abstract String getName();

    public abstract double getPrice();

    public abstract String getType();

    public abstract void setType(String type);

    public void displayDish(){
        System.out.println("the dish is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
        System.out.println(this.getClass());
    }

    public static Dish findDish(String name){
        for (Dish dish: dishes){
            if(dish.name.equalsIgnoreCase(name)){
                return dish;
            }
        }
        System.out.println("we don't find this Dishe");
        return null;
    }
}

