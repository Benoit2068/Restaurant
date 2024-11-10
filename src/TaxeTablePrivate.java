
public class TaxeTablePrivate implements TaxeTable{

    Table table;

    public TaxeTablePrivate(Table table){
        this.table = table;
    }

    @Override
    public double taxeTableCalculate() {
        return TaxationPrivate.taxePrivateCalculate(table.billAmount);
    }

    public void displayTaxe(){
        double billAmountWithTax = table.billAmount + taxeTableCalculate();
        System.out.println("Taxe private amount = " + taxeTableCalculate() + " CHF");
        System.out.println("Total private bill = " + billAmountWithTax + " CHF");
    }
}
