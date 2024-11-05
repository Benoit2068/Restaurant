public abstract class ProductDecorator implements Product {

 Product product;
 Menu menu;

ProductDecorator(Product source){
    this.product = source;
}

ProductDecorator(Menu menu){
     this.menu=menu;
}

public abstract double getPrice();

public String getName() {
        return this.getName();
    }

    public String getType() {
        return this.getType();
    }

}
