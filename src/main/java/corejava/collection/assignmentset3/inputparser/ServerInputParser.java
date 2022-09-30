package corejava.collection.assignmentset3.inputparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import corejava.collection.assignmentset2.question1.mapper.SoftwareMapper;
import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.mapper.ServerMapper;
import corejava.collection.assignmentset3.model.Server;

public class ServerInputParser {
    public List<Server> parseArray(final String[] inputData) {
        List<Server> list = new ArrayList<>();
        for (String data : inputData) {
			ServerMapper serverMapper = new ServerMapper();
            Server Server = serverMapper.map(data);
            list.add(Server);
        }
        return list;
    }

    public List<Server> parseCSVFile(String filePath) throws InvalidPathException {
        List<Server> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }
            String lineText;
            while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0) {
				ServerMapper serverMapper = new ServerMapper();
                Server server = serverMapper.map(lineText);
                if (server != null) {
                    list.add(server);
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }

    public void printList(List<Server> servers) {
        for (Server server : servers) {
            System.out.println(server);
        }
    }

}
