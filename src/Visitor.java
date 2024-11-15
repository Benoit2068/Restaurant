public interface Visitor {

    String visit(Dish dish);
    String visit(Drink drink);
    String visit(Menu menu);
}
