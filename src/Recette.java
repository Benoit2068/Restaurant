
import java.util.ArrayList;
import java.util.List;

public final class Recette {

    List<Table> tableList = new ArrayList();
    private static Recette instance = null;

    private Recette(){
    }


    public final synchronized static Recette getInstance(){
        if(Recette.instance==null){
            Recette.instance=new Recette();
        }
        return Recette.instance;
    }
}
