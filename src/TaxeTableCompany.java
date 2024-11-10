public class TaxeTableCompany implements TaxeTable {
    Table table;

    public TaxeTableCompany(Table table){
        this.table = table;
    }

    @Override
    public double taxeTableCalculate() {
        return TaxationCompany.taxeCompanyCalculate(table.billAmount);
    }

    public void displayTaxe(){
        double billAmountWithTax = table.billAmount + taxeTableCalculate();
        System.out.println("Taxe company amount = " + taxeTableCalculate() + " CHF");
        System.out.println("Total company bill = " + billAmountWithTax + " CHF");
    }
}
