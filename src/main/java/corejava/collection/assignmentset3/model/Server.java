package corejava.collection.assignmentset3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Server {
    private String serverName;

    private String softwareType;

    private String softwareTypeName;

    private String versionNumber;

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Server Name: {0} | Platform: {1} | Software: {2} | Version: {3} {4}",
                serverName, softwareType, softwareTypeName, versionNumber, System.lineSeparator());
    }
}
