package corejava.collection.assignmentset2.question3.mapper;

import corejava.collection.assignmentset2.question3.model.Product;

public class ProductMapper {
    public static Product map(final String data) throws RuntimeException {
        Product product;
        try {
            String[] arrData = data.split(", ");
            String productName = (arrData[0]);
            String libraryName = arrData[1];
            String version = (arrData[2]);
            product = new Product(productName, libraryName, version);
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        return product;
    }
}
