public class Dish implements Product {
    private String name;
    private double price;
    private String type;

    Dish (String name, double price, String type){
        this.name = name;
        this.price = price;
        setType(type);
    }
    @Override
    public void setType(String type){
        if (type.equalsIgnoreCase("starter") || type.equalsIgnoreCase("main") || type.equalsIgnoreCase("dessert")){
            this.type = type;
        }
        else {
            System.out.println("the txpe doesn't exist : Dish is not create");
        }
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void setPrice(double price){
        this.price = price;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String getType(){
        return type;
    }

    @Override
    public void readDish(){
        System.out.println("the dish is " + this.name + ", the price is " + this.price + ", the type is " + this.type +".");
    }

}
