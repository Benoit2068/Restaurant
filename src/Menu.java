import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu extends BaseProduct {
    protected List<Product> productsInMenu = new ArrayList<>();

    Menu(Product... components) {
        super(null, 0d, null);
        add(components);
    }


    @Override
    public void setType(String type) {
    }

    public void add(Product component){
        productsInMenu.add(component);
    }

    public void add(Product... components){
        productsInMenu.addAll(Arrays.asList(components));
    }

    public void remove(Product component){
        productsInMenu.remove(component);
    }

    public void remove(Product... components){
        productsInMenu.removeAll(Arrays.asList(components));
    }

    public void clear(){
        productsInMenu.clear();
    }

}
