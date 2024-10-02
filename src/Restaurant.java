//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Restaurant {

    public static void main(String[] args) {

        Dish salad = new Dish("salad", 4.50d, "starter");
        salad.setName("Salad César");
        salad.displayDish();

        BaseProduct coca = new Drink("Coca Cola", 3.90d, "sparkling");

        ((Drink) coca).displayDrink();


        Menu menuOfTheDay = new Menu();
        menuOfTheDay.name = "Menu of the Day";
        menuOfTheDay.add(coca, salad);
        menuOfTheDay.displayMenu();

        Dish burger = new DishRish("Burger", 7.85d, "main");
        burger.displayDish();




    }
}