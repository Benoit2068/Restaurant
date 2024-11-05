public class ExtraDoseDecorator extends ProductDecorator {

    public ExtraDoseDecorator(Product product){
        super(product);
    }

    public double getPrice(){
        return product.getPrice()*1.15d;
    }


}
