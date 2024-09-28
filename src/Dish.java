public class Dish {
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



}
