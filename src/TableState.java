public abstract class TableState {

    Table table;

    TableState(Table table){
        this.table = table;
    }

    public abstract void welcomeClient(Table table);
    public abstract void serveProduct(Table table);
    public abstract void closeTable(Table table);
    public abstract void displayTable(Table table);

}
