public class DishRish implements Dish{
    public String name;
    public double price;
    public String type;


    DishRish (String name, double price, String type){
        this.name = name;
        this.price = price;
        setType(type);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        if (type.equalsIgnoreCase("starter") || type.equalsIgnoreCase("main") || type.equalsIgnoreCase("dessert")){
            this.type = type;
        }
        else {
            System.out.println("the type doesn't exist : Dish is not create");
        }
    }

    public void displayDish(){
        System.out.println("the dish is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
    }
}
