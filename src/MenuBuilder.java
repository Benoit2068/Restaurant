public interface MenuBuilder {

    void buildStarter(Dish dish);
    void buildMain();
    void buildDessert1();
    void buildDessert2();
    void buildDrink1();
    void buildDrink2();
    Menu getMenu();

}
