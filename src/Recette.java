
import java.util.ArrayList;
import java.util.List;

public final class Recette {

    public static List<Table> tableListClosed = new ArrayList();
    private static Recette instance = null;

    private Recette(){
    }


    public final synchronized static Recette getInstance(){
        if(Recette.instance==null){
            Recette.instance=new Recette();
        }
        return Recette.instance;
    }

    public static void saveTable(Table table){
        if (table.closed == true){
            table.calculateBill();
            tableListClosed.add(table);
        }
        else {
            System.out.println("this table is not close : can't be add to Recette");
        }
    }



}
