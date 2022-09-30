package corejava.collection.assignmentset2.question2.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String customerName;
    private String location;
    private Integer date;
    private String productName;
    private Integer price;
    private String paymentType;

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}
