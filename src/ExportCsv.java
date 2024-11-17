import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ExportCsv {

    public static void exporterProductsListCSV(String filePath) throws IOException {
        ProductList productList = ProductList.getInstance();
        List<Product> products = productList.getProducts();
        Visitor visitor = new ExportCsvVisitor();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            Iterator<Product> iterator = products.iterator();
            while (iterator.hasNext()){
                Product product = iterator.next();
                //Ecrit les lignes dans le fichier CSV en passant par le visitor et en utilisant les métodes export...()
                writer.write(product.accept(visitor));
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error during exportation CSV file");
        }

    }


}
