public class Dish implements Product {
    private String name;
    private double price;
    private String type;

    Dish (String name, double price, String type){
        this.name = name;
        this.price = price;
        setType(type);
    }

    public void setType(String type){
        if (type.equalsIgnoreCase("starter") || type.equalsIgnoreCase("main") || type.equalsIgnoreCase("dessert")){
            this.type = type;
        }
        else {
            System.out.println("the txpe doesn't exist : Dish is not create");
        }
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

    public String type(){
        return type;
    }


    public void readDish(){
        System.out.println();
    }

}
