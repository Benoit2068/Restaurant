public class Dish extends BaseProduct {


    Dish (String name, double price, String type){
        super(name, price, type);
    }

    public void setType(String type){
        if (type.equalsIgnoreCase("starter") || type.equalsIgnoreCase("main") || type.equalsIgnoreCase("dessert")){
            this.type = type;
        }
        else {
            System.out.println("the txpe doesn't exist : Dish is not create");
        }
    }



    public void displayDish(){
        System.out.println("the dish is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
    }

}
