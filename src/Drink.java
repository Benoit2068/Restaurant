public class Drink implements Product {

    private String name;
    private double price;
    private String type;

    Drink (String name, double price, String type){
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
        if (type.equalsIgnoreCase("hot") || type.equalsIgnoreCase("cold") || type.equalsIgnoreCase("sparkling") || type.equalsIgnoreCase("alcoholic")){
            this.type = type;
        }
        else {
            System.out.println("the type doesn't exist : Drink is not create");
        }
    }

    public void displayDrink(){
        System.out.println("the drink is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
    }

}
