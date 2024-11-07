//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.text.StyledEditorKit;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Restaurant {



    public static void main(String[] args) {

        AbstractFactory factory = ConfigurationFactory.configureAbstractFactory();

        factory.createDish("poulet au curry", 5.90d, "main").displayDish();
        factory.createDrink("Orange juce", 2.50d, "cold").displayDrink();
        factory.createDrink("bière", 3.50d, "sparkling").displayDrink();
        factory.createDrink("CocaCola", 3.50d, "cold").displayDrink();
        factory.createDish("Burger", 6.80d, "main");
        factory.createDish("César Salad", 3.90d, "starter");


        Menu menuChicken = new Menu();
        menuChicken.add(Dish.findDish("poulet au curry"));
        menuChicken.add(Drink.findDrink("CocaCola"));
        menuChicken.setName("Chicken Menu");



        Table table1 = new Table("Robert", LocalDate.of(2024, 10, 19), "pleasure");

        

        table1.addProductInProductsConsumedList(Dish.findDish("poulet au curry"));
        table1.addProductInProductsConsumedList(Drink.findDrink("Orange juce"));
        table1.addProductInProductsConsumedList(Drink.findDrink("CocaCola"));
        table1.addProductInProductsConsumedList(Dish.findDish("Burger"));

        table1.printBillTable();
        Recette.saveTable(table1);

        //Labo 2 task 1 test

        Recette recette1 = Recette.getInstance();
        Recette recette2 = Recette.getInstance();

        System.out.println(recette1);
        System.out.println(recette2);

        //Labo 2 task 2 test

        table1.displayTable();
        table1.serveProduct();
        table1.closedTable();
        table1.welcomeClient();
        table1.displayTable();
        table1.welcomeClient();
        table1.serveProduct();
        table1.displayTable();
        table1.welcomeClient();
        table1.closedTable();
        table1.displayTable();

        //Labo 3 task 1 test

        Product chicken = Dish.findDish("poulet au curry");
        System.out.println(chicken.getPrice());

        ProductDecorator chickenExtraDose = new ExtraDoseDecorator(chicken);
        System.out.println(chickenExtraDose.getPrice());

        ProductDecorator chickenExtraDoseExtraTaste = new ExtraTasteDecorator(chickenExtraDose);
        System.out.println(chickenExtraDoseExtraTaste.getPrice());


        Menu chickenCoca = new Menu();
        chickenCoca.add(Dish.findDish("poulet au curry"));
        chickenCoca.add(Drink.findDrink("CocaCola"));

        System.out.println(chickenCoca.getPrice());
        ProductDecorator chickenCocaExtraDose = new ExtraDoseDecorator(chickenCoca);
        System.out.println(chickenCocaExtraDose.getPrice());


        //labo3 tesk 1 test
        System.out.println("Labo 3 tesk 1 test");

        DishVegan greenSalad = new DishVegan("salade verte", 3.4d, "starter");

        MenuBuilder veganMenuBuilder = new MenuVeganBuilder();
        DirectorNormalMenu directorNormalMenuVegan = new DirectorNormalMenu(veganMenuBuilder);

        Menu MenuNormalVegan = directorNormalMenuVegan.construcMenu(greenSalad);

        MenuNormalVegan.displayMenu();



    }
}
