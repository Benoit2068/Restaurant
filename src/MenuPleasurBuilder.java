public class MenuPleasurBuilder implements MenuBuilder{
    Menu menu;

    public MenuPleasurBuilder(){
        this.menu = new Menu();
    }


    @Override
    public void buildStarter() {
        DishRish quiche = new DishRish("Quiche", 4.50d, "starter");
        menu.add(quiche);
    }

    @Override
    public void buildMain() {
        DishRish burger = new DishRish("Burger", 6.50d, "main");
        menu.add(burger);
    }

    @Override
    public void buildDessert1() {
        DishRish tiramisu = new DishRish("Tiramisu", 7.20d, "dessert");
        menu.add(tiramisu);
    }

    @Override
    public void buildDessert2() {
        DishRish profiteroleAuChocolat = new DishRish("Profiteroles au Chocolat", 5.20d, "dessert");
        menu.add(profiteroleAuChocolat);
    }

    @Override
    public void buildDrink1() {
        DrinkAlcoholic beer = new DrinkAlcoholic("Bière", 5.20d, "cold");
        menu.add(beer);
    }

    @Override
    public void buildDrink2() {
        DrinkAlcoholic redWine = new DrinkAlcoholic("Vin Rouge", 7.50d, "cold");
        menu.add(redWine);
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
