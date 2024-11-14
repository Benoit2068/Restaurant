import java.util.Iterator;
import java.util.List;

public class IteratorRecetteAmountMoreThan  implements Iterator<Table> {
    private List<Table> tables;
    private double amountMinimum;
    private int position = 0;



    public IteratorRecetteAmountMoreThan (List<Table> tables, double anountMinimum){
        this.tables = tables;
        this.amountMinimum = anountMinimum;
    }


    @Override
    public boolean hasNext() {
        while (position < tables.size()) {
            if (tables.get(position).billAmount > amountMinimum) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Table next() {
        return tables.get(position++);
    }
}
