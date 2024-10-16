public class DishRish extends Dish{

    DishRish (String name, double price, String type){
        super(name, price, type);
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

}
