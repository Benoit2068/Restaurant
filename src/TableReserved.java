public class TableReserved  extends TableState{

    TableReserved(Table table) {
        super(table);
    }

    @Override
    public void welcomeClient(Table table) {
            table.changeTableState(new TableServed(table));
            System.out.println("Welcome Mr " + table.getClient());
    }

    @Override
    public void serveProduct(Table table) {
        System.out.println("Your table status is not served. I can't serve any product");
    }

    @Override
    public void closeTable(Table table) {
        System.out.println("Your table status is not served. I can't closed the table");
    }

    @Override
    public void displayTable(Table table) {
        System.out.println("your table status is reserved");
    }


}
