package corejava.collection.assignmentset2.question1.solution;
import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question1.model.SoftwareStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutOfDateSoftware {
    public Map<String, SoftwareStatus> getLatestSoftwareTypeNameVersionMap(Iterable<Software> softWares) {
        Map<String, SoftwareStatus> softwareMap = new HashMap<>();
        for (Software softWare : softWares) {
            String softWareTypename = softWare.getSoftwareTypeName();
            String currentVersion = softWare.getVersionNumber();
            if (softwareMap.containsKey(softWareTypename)) {
                SoftwareStatus softwareStatus = softwareMap.get(softWareTypename);
                int softwareCount = softwareStatus.getInstalledCount();
                softwareCount++;
                softwareStatus.setInstalledCount(softwareCount);
                String latestVersion = softwareStatus.getLatestVersion();
                if (currentVersion.compareTo(latestVersion) > 0) {
                    latestVersion = currentVersion;
                    softwareStatus.setLatestVersion(latestVersion);
                    softwareMap.put(softWareTypename, softwareStatus);
                }
            } else {
                SoftwareStatus softwareStatus = new SoftwareStatus(currentVersion, 1);
                softwareMap.put(softWareTypename, softwareStatus);
            }
        }
        return softwareMap;
    }

    public List<Software> getOutOfDateVersionIsInstalledOnAtLeastTwoDifferentServers(Iterable<Software> softWares, Map<String, SoftwareStatus> latestSoftwareVersion) {
        List<Software> softWareList = new ArrayList<>();
        for (Software softWare : softWares) {
            String softwareTypeName = softWare.getSoftwareTypeName();
            String currentVersion = softWare.getVersionNumber();
            SoftwareStatus softwareStatus = latestSoftwareVersion.get(softwareTypeName);
            String softwareStatusLatestVersion = softwareStatus.getLatestVersion();
            int softwareCount = softwareStatus.getInstalledCount();
            if (softwareCount > 2 && currentVersion.compareTo(softwareStatusLatestVersion) < 0) {
                softWareList.add(softWare);
            }
        }
        return softWareList;
    }

    public void printSoftwareMap(Map<String, SoftwareStatus> softwareMap) {
        for (Map.Entry<String, SoftwareStatus> entry : softwareMap.entrySet()) {
            String key = entry.getKey();
            SoftwareStatus version = entry.getValue();
            System.out.println("Key: " + key + " " + "Value: " + version);
        }
    }
}
