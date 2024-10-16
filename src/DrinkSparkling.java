public class DrinkSparkling extends Drink{


    DrinkSparkling(String name, double price, String type) {
        super(name, price, type);
    }

    public void setName(String name) {
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
        if (type.equalsIgnoreCase("hot") || type.equalsIgnoreCase("cold") || type.equalsIgnoreCase("sparkling") || type.equalsIgnoreCase("alcoholic")){
            this.type = type;
        }
        else {
            System.out.println("the type doesn't exist : Drink is not create");
        }
    }


}
