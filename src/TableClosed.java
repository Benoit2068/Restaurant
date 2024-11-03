public class TableClosed extends TableState{

    TableClosed(Table table){
        super(table);
    }

    @Override
    public void welcomeClient(Table table) {
        System.out.println("Your table is closed: there's nothing else you can do");
    }

    @Override
    public void serveProduct(Table table) {
        System.out.println("Your table is closed: there's nothing else you can do");
    }

    @Override
    public void closeTable(Table table) {
        System.out.println("Your table is closed: there's nothing else you can do");
    }

    @Override
    public void displayTable(Table table) {
        System.out.println("your table status is closed");
        table.printBillTable();
    }
}
