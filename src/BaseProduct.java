abstract class BaseProduct implements Product {

    public String name;
    public double price;
    public String type;

    BaseProduct (String name, double price, String type){
        this.name = name;
        this.price = price;
        setType(type);
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

}
