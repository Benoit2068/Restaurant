public abstract class Drink implements Product {

    String name;
    double price;
    String type;

    Drink (String name, double price, String type){
        this.name = name;
        this.price = price;
        this.setType(type);
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

}
