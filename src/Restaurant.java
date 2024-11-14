//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import javax.swing.text.StyledEditorKit;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Iterator;
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

        //Labo 3 task1

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


        //labo3 task2
        System.out.println("=================Labo-3 task-2==========================");

        MenuBuilder veganMenuBuilder = new MenuVeganBuilder();
        DirectorNormalMenu directorNormalMenuVegan = new DirectorNormalMenu(veganMenuBuilder);
        Menu menuNormalVegan = directorNormalMenuVegan.construcMenu();
        menuNormalVegan.setName("Menu Vegan Normal");
        menuNormalVegan.displayMenu();

        MenuBuilder pleasureMenuBuilder = new MenuPleasurBuilder();
        DirectorGenerousMenu directorGenerousMenuPleasure = new DirectorGenerousMenu(pleasureMenuBuilder);
        Menu menuGenerousPleasure = directorGenerousMenuPleasure.construcMenu();
        menuGenerousPleasure.setName("Menu Plaisir Généreux");
        menuGenerousPleasure.displayMenu();

        //Labo4 task1
        System.out.println("=================Labo-4 task-1==========================");

        table1.displayTable();
        TaxeTablePrivate taxeTablePrivate = new TaxeTablePrivate(table1);
        taxeTablePrivate.taxeTableCalculate();
        taxeTablePrivate.displayTaxe();

        TaxeTableCompany taxeTableCompany = new TaxeTableCompany(table1);
        taxeTableCompany.taxeTableCalculate();
        taxeTableCompany.displayTaxe();

        System.out.println("=================Labo-4 task-2==========================");

        Table table2 = new Table("toto", LocalDate.of(2024, 12, 31),"vegan");
        table2.welcomeClient();
        table2.addProductInProductsConsumedList(Drink.findDrink("CocaCola"));
        table2.addProductInProductsConsumedList(Dish.findDish("Burger"));
        table2.serveProduct();

        table1.addObservator(recette1);
        table1.closed();
        table2.addObservator(recette1);
        table2.closed();
        recette1.displayRecette();

        System.out.println("=================Labo-5 task-1==========================");

        Iterator<Table> iteratorAmount = recette1.getIteratorRecetteAmountMoreThan(50);
        System.out.println("Table with amount > 50");
        while (iteratorAmount.hasNext()) {
            Table table = iteratorAmount.next();
            System.out.println("- client = " + table.getClient() + " Amount = " + table.billAmount);
        }

        Iterator<Table> iteratorMonth = recette1.getIteratorRecetteByMonth(12);
        System.out.println("Table with mont = 12");
        while (iteratorMonth.hasNext()) {
            Table table= iteratorMonth.next();
            System.out.println(("- client = " + table.getClient() + " Month = " + table.getDate().getMonth()));

        }


    }
}
