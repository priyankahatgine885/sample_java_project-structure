package corejava.collection.assignmentset3.mapper;

import corejava.collection.assignmentset3.model.Server;

public class ServerMapper implements CSVToObjectMapper {
    public Server map(String serverData) {
        Server server;
        try{
            if(serverData == null || serverData.length() == 0) {
                throw new RuntimeException("Null or empty input");
            }
            String[] serverArray = serverData.split(", ");
            if(serverArray.length != 4) {
                throw new RuntimeException("Invalid number of values");
            }
            String serverName = serverArray[0];
            String softwareType = serverArray[1];
            String softwareTypeName = serverArray[2];
            String versionNumber = serverArray[3];

            server = new Server(serverName, softwareType, softwareTypeName, versionNumber);

        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
    	return server;
    }
}
