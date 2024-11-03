//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Restaurant {



    public static void main(String[] args) {

        AbstractFactory factory = ConfigurationFactory.configureAbstractFactory();

        factory.createDish("poulet au curry", 5.90d, "main").displayDish();
        factory.createDrink("Orange juce", 2.50d, "cold").displayDrink();
        factory.createDrink("bière", 3.50d, "sparkling").displayDrink();
        factory.createDrink("Orange juce", 2.50d, "cold").displayDrink();

    }
}
