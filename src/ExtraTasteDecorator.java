public class ExtraTasteDecorator extends ProductDecorator{

    public ExtraTasteDecorator(Product product){
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice()*1.10d;
    }
}
