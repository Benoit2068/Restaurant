import java.util.Scanner;

public class TableServed extends TableState{
    TableServed(Table table) {
        super(table);
    }

    @Override
    public void welcomeClient(Table table) {
        System.out.println("We already serve you");
    }

    @Override
    public void serveProduct(Table table) {
        System.out.println("we serve you products you have ordered : " );
        for(int i = 0; i < table.productsConsumed.size(); i++){
            System.out.println("name : " + table.productsConsumed.get(i).getName()+", type : " + table.productsConsumed.get(i).getType());
        }
    }

    @Override
    public void closeTable(Table table) {
        System.out.println("Would you like to close your table? Yes/No");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            table.changeTableState(new TableClosed(table));
            System.out.println("ok your table is now closed");
        }
        else if (answer.equalsIgnoreCase("no")){
            System.out.println("ok you can order somethink else");
        }
        else {
            closeTable(table);
        }
    }

    @Override
    public void displayTable(Table table) {
        System.out.println("your table status is served");
    }
}
