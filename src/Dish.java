public interface Dish extends Product {



    void setName(String name);

    void setPrice(double price);

    String getName();

    double getPrice();

    String getType();

    void setType(String type);

    void displayDish();

}
