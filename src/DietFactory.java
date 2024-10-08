public class DietFactory implements ProductFactory{


    @Override
    public Drink createDrink(String name, double price, String type) {
        return new DrinkLight(name, price, type);
    }

    @Override
    public Dish createDish(String name, double price, String type) {
        return new DishDiet(name, price, type);
    }
}
