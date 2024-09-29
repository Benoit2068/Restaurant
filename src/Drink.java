public class Drink extends BaseProduct {


    Drink (String name, double price, String type){
        super(name, price, type);
    }

    @Override
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
