//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {

        Dish salad = new Dish("salad", 4.50d, "starter");
        salad.setName("Salade César");

        System.out.println(salad);
        salad.displayDish();

        BaseProduct coca = new Drink("Coca Cola", 3.90d, "sparkling");
        System.out.println(coca);
        ((Drink) coca).displayDrink();
        System.out.println(coca);

        Menu dishOfTheDay = new Menu();
        dishOfTheDay.name = "table14";
        System.out.println(dishOfTheDay);

        dishOfTheDay.add(coca, salad);
        System.out.println(dishOfTheDay.getClass().getName());



    }
}