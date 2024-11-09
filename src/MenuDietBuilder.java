public class MenuDietBuilder implements MenuBuilder{

    Menu menu;

    public MenuDietBuilder(){
        this.menu = new Menu();
    }

    @Override
    public void buildStarter() {
        DishDiet soup = new DishDiet("Soupe", 3.55d, "starter");
        menu.add(soup);
    }

    @Override
    public void buildMain() {
        DishDiet bouillon = new DishDiet("Bouillon", 4.40d, "main");
        menu.add(bouillon);
    }

    @Override
    public void buildDessert1() {
        DishDiet sorbet = new DishDiet("Sorbet", 3.00d, "dessert");
        menu.add(sorbet);
    }

    @Override
    public void buildDessert2() {
        DishDiet fruitSalade = new DishDiet("Salade de Fruit", 2.50d, "dessert");
        menu.add(fruitSalade);
    }

    @Override
    public void buildDrink1() {
        DrinkLight water = new DrinkLight("Eau plate", 2.00d, "cold");
        menu.add(water);
    }

    @Override
    public void buildDrink2() {
        DrinkLight tea = new DrinkLight("Eau plate", 2.00d, "hot");
        menu.add(tea);
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
