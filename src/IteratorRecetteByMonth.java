import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRecetteByMonth implements Iterator<Table> {
    private List<Table> tables;
    int month;
    int position = 0;



    public IteratorRecetteByMonth(List<Table> tables, int month) {
        this.tables=tables;
        this.month = month;
    }


    @Override
    public boolean hasNext() {
        while (position < tables.size()){
            if(tables.get(position).getDate().getMonthValue() == month){
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
