public class DirectorNormalMenu {

    MenuBuilder menuBuilder;

    public DirectorNormalMenu(MenuBuilder menuBuilder){
            this.menuBuilder = menuBuilder;
    }

    public Menu construcMenu(Dish dish1) {
        menuBuilder.buildStarter(dish1);
        menuBuilder.buildMain();
        menuBuilder.buildDessert1();
        menuBuilder.buildDrink1();
        return menuBuilder.getMenu();
    }
}
