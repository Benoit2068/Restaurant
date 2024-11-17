public class ExportCsvVisitor implements Visitor{
    @Override
    public String visit(Dish dish) {
        return dish.exportDish();
    }

    @Override
    public String visit(Drink drink) {
        return drink.exportDrink();
    }

    @Override
    public String visit(Menu menu) {
        return menu.exportMenu();
    }
}
