//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dish salad = new Dish("salad", 4.50d, "starter");
        salad.setName("Salade César");

        System.out.println(salad);
        salad.displayDish();

        BaseProduct coca = new Drink("Coca Cola", 3.90d, "sparkling");
        System.out.println(coca);
        ((Drink) coca).displayDrink();
        System.out.println(coca);





    }
}