public class ProductCreator {

    private Dish dish;
    private Drink drink;

    public ProductCreator(ProductFactory factory, String name, double price, String type){
        dish = factory.createDish(name, price, type);
        drink = factory.createDrink(name, price, type);
    }
}
