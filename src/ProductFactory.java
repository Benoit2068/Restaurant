public interface ProductFactory {

    Drink createDrink(String name, double price, String type);

    Dish createDish(String name, double price, String type);
}
