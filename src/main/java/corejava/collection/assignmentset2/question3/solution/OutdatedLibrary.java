package corejava.collection.assignmentset2.question3.solution;

import corejava.collection.assignmentset2.question3.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutdatedLibrary {
    public Map<String, String> getLatestLibraryVersionMap(Iterable<Product> products) {
        Map<String, String> productMap = new HashMap<>();
        for (Product product : products) {
            String library = product.getLibraryName();
            String currentVersion = product.getVersion();
            if (productMap.containsKey(library)) {
                String latestVersion = productMap.get(library);
                if (latestVersion.compareTo(currentVersion) > 0) {
                    currentVersion = latestVersion;
                }
            }
            productMap.put(library, currentVersion);
        }
        return productMap;
    }

    public List<Product> getOutdatedLibraryProducts(Iterable<Product> products, Map<String, String> latestLibraryVersionMap) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            String library = product.getLibraryName();
            String currentVersion = product.getVersion();
            String latestVersion = latestLibraryVersionMap.get(library);
            if (currentVersion.compareTo(latestVersion) < 0) {
                list.add(product);
            }
        }
        return list;
    }

    public void printProductMap(Map<String, String> productMap) {
        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            String key = entry.getKey();
            String product = entry.getValue();
            System.out.println("Key: " + key + " " + "Value: " + product);
        }
    }
}