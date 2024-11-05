public class MenuExtraDoseDecorator extends ProductDecorator{

    MenuExtraDoseDecorator(Menu menu){
        super(menu);
    }

    @Override
    public double getPrice() {
        return menu.getPrice()*1.10d;
    }
}
