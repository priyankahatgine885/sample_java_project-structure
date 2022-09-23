package corejava.collection.assignmentset2.question3;
import corejava.collection.assignmentset2.question3.model.Product;
import corejava.collection.assignmentset2.question3.parser.ProductInputParser;
import corejava.collection.assignmentset2.question3.solution.OutdatedLibrary;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            ProductInputParser inputParser = new ProductInputParser();
            List<Product> productList = inputParser.parseCSVFile("./src/main/resources/data/productData.csv");
            OutdatedLibrary outdatedLibrary = new OutdatedLibrary();
            Map<String, String> productMap = outdatedLibrary.getLatestLibraryVersionMap(productList);
            System.out.println("Latest library Version is : ");
            outdatedLibrary.printProductMap(productMap);
            System.out.println("-----------------------------");
            List<Product> libraryProducts = outdatedLibrary.getOutdatedLibraryProducts(productList, productMap);
            System.out.println("OutDated library Version is : ");
            for (Product productName : libraryProducts) {
                System.out.println(productName);
            }
        } catch (InvalidPathException |
                 RuntimeException cause) {
            System.out.println(cause.getMessage());
        }
    }
}
