public class VeganFactory implements ProductFactory{

    @Override
    public Drink createDrink(String name, double price, String type) {
        return new DrinkSparkling(name, price, type);
    }

    @Override
    public Dish createDish(String name, double price, String type) {
        return new DishVegan(name, price, type);
    }
}
