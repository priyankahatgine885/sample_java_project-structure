package corejava.collection.assignmentset3.question2;

import java.util.List;

import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.services.ServerService;

public class Question0203 {

	public static void main(String[] args) {
		String[] serversInformation = {
                "Server1, Database, MySQL, 5.5",
                "Server2, Database, MySQL, 5.1",
                "Server3, OS, Ubuntu, 12.04",
                "Server1, OS, Ubuntu, 12.04",
                "Server2, OS, Ubuntu, 18.04",
                "Server3, Language, Python, 2.6.3",
                "Server4, Language, Python, 3.9.14",
                "Server4, Language, Python, 3.10.4"
        };
		ServerInputParser serverInputParser = new ServerInputParser();
		List<Server> servers = serverInputParser.parseArray(serversInformation);
		
		ServerService serverService = new ServerService(servers);
		List<Server> sortedServers = serverService.getSortedListOnServerNameSoftwareVersion();
		System.out.println(sortedServers);
	}

}
