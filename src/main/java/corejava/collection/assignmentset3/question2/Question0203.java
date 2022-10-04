package corejava.collection.assignmentset3.question2;

import java.util.List;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.services.ServerService;

public class Question0203 {

	public static void main(String[] args) {
		try {
			ServerInputParser serverInputParser = new ServerInputParser();
			List<Server> servers = serverInputParser.parseCSVFile("./src/main/resources/data/serverData.csv");
			ServerService serverService = new ServerService(servers);
			List<Server> sortedServers = serverService.getSortedListOnServerNameSoftwareVersion();
			serverInputParser.printList(sortedServers);
		} catch (InvalidPathException cause) {
			throw new RuntimeException(cause);
		}
	}
}
