

public interface Product {

    String getName();
    double getPrice();
    String getType();

    public abstract String accept(Visitor visitor);

}
