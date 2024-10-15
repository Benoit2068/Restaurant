//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Restaurant {

    private static AbstractFactory configureAbstractFactory() {
        AbstractFactory factory;
        System.out.println("chose your table type : pleasure, diet or vegan");
        Scanner sc = new Scanner(System.in);
        String tableType = sc.nextLine();

        if (tableType.equalsIgnoreCase("pleasure")) {
            factory = new PleasureFactory();
        } else if (tableType.equalsIgnoreCase("diet")) {
            factory= new DietFactory();
        } else if (tableType.equalsIgnoreCase("vegan")) {
            factory = new VeganFactory();
        } else {
            System.out.println("your choice doesn't exist");
            return configureAbstractFactory();
        }
        return factory;
    }

    public static void main(String[] args) {

        AbstractFactory factory = configureAbstractFactory();

        factory.createDish("poulet au curry", 5.90d, "main");
        factory.createDrink("Orange juce", 2.50d, "cold");

        factory.createDrink("bière", 3.50d, "sparkling");



        System.out.println(factory.createDrink("Orange juce", 2.50d, "cold"));

    }




    }
