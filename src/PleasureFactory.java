public class PleasureFactory implements AbstractFactory{

    @Override
    public Drink createDrink(String name, double price, String type){
        return new DrinkAlcoholic(name, price, type);
    }
    @Override
    public Dish createDish(String name, double price, String type) {
        return new DishRish(name, price, type);
    }
}
