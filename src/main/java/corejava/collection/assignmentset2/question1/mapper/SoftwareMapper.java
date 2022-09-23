package corejava.collection.assignmentset2.question1.mapper;

import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question3.model.Product;

public class SoftwareMapper {
    public static Software map(final String data) throws RuntimeException {
        Software software;
        try {
            String[] arrData = data.split(",");
            String serverName = (arrData[0]);
            String softwareType = arrData[1];
            String softwareTypeName = (arrData[2]);
            String versionNumber = (arrData[3]);
            software = new Software(serverName, softwareType,softwareTypeName, versionNumber);
        } catch (NumberFormatException numberFormatException) {
            throw new RuntimeException(numberFormatException);
        }
        return software;
    }
}
