
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recette implements Observator{

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
        if (table.getTableState() instanceof TableClosed){
                table.calculateBill();
            tableListClosed.add(table);
        }
        else {
            System.out.println("this table is not close : can't be add to Recette");
        }
    }

    public void displayRecette(){
        double totalRecette = 0;
        for (Table table : tableListClosed){
            table.displayTable();
            totalRecette = totalRecette + table.billAmount;
        }
        System.out.println("total recette = " + totalRecette );
    }


    @Override
    public void update(Table table) {
        table.changeTableState(new TableClosed(table));
        tableListClosed.add(table);
    }


    public Iterator<Table> getIteratorRecetteAmountMoreThan (double amount){
        return new IteratorRecetteAmountMoreThan(this.tableListClosed, amount);
    }
}
