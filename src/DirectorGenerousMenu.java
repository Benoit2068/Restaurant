public class DirectorGenerousMenu {
    private MenuBuilder menuBuilder;

    public DirectorGenerousMenu(MenuBuilder menuBuilder){
        this.menuBuilder = menuBuilder;
    }

    public Menu construcMenu(Dish dish1) {
        menuBuilder.buildStarter(dish1);
        menuBuilder.buildMain();
        menuBuilder.buildDessert1();
        menuBuilder.buildDessert2();
        menuBuilder.buildDrink1();
        menuBuilder.buildDrink2();
        return menuBuilder.getMenu();
    }


}
