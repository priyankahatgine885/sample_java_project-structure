package corejava.collection.assignmentset2.question2.mapper;

import corejava.collection.assignmentset2.question2.model.Customer;
import corejava.collection.assignmentset2.question3.model.Product;

public class CustomerMapper {
    public static Customer map(final String data) throws RuntimeException {
        Customer customer;
        try {
            String[] arrData = data.split(", ");
            String customerName = (arrData[0]);
            String location = arrData[1];
            Integer date = (Integer.parseInt(arrData[2]));
            String productName = arrData[3];
            Integer price = (Integer.parseInt(arrData[4]));
            String paymentType = arrData[5];
          customer = new Customer(customerName, location, date, productName, price, paymentType);
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        return customer;
    }
}
