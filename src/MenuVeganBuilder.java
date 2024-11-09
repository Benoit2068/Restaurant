public class MenuVeganBuilder implements MenuBuilder {

    Menu menu;


    public MenuVeganBuilder() {
        this.menu = new Menu();
    }


    @Override
    public void buildStarter() {
        DishVegan greenSalad = new DishVegan("salade verte", 3.4d, "vegan");
        menu.add(greenSalad);
    }

    @Override
    public void buildMain() {
        DishVegan pasta = new DishVegan("pâtes", 4.5d, "main");
        menu.add(pasta);

    }

    @Override
    public void buildDessert1() {
        DishVegan veganCake = new DishVegan("gateau végan", 3.0d, "dessert");
        menu.add(veganCake);
    }

    @Override
    public void buildDessert2() {
        DishVegan fruitdSalad = new DishVegan("salade de fruit", 3.0d, "dessert");
        menu.add(fruitdSalad);
    }

    @Override
    public void buildDrink1() {
        DrinkSparkling sparkilgwater = new DrinkSparkling("eau gazeuse", 2.3d, "sparkling");
        menu.add(sparkilgwater);
    }

    @Override
    public void buildDrink2() {
        DrinkSparkling tomatojuice = new DrinkSparkling("jus de tomate", 3.5d, "sparkling");
        menu.add(tomatojuice);
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
