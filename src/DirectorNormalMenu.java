public class DirectorNormalMenu {

    MenuBuilder menuBuilder;

    public DirectorNormalMenu(MenuBuilder menuBuilder){
            this.menuBuilder = menuBuilder;
    }

    public Menu construcMenu() {
        menuBuilder.buildStarter();
        menuBuilder.buildMain();
        menuBuilder.buildDessert1();
        menuBuilder.buildDrink1();
        return menuBuilder.getMenu();
    }
}
