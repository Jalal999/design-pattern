
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * 
 */
public class loadConfigFile implements ConfigManager {
	ArrayList<String> readConfig;
	int count;

    /**
     * Default constructor
     */
    public loadConfigFile() {
    }

	@Override
	public void readFile() throws IOException, ParserConfigurationException, SAXException {
		readConfig = new ArrayList<>();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("config.txt"));
        String readLine;
        
        while((readLine = bufferedReader.readLine()) != null){
            readConfig.add(readLine);
        }
		
	}

	@Override
	public String nextItem() {
		// TODO Auto-generated method stub
		return readConfig.get(count++);
	}

	@Override
	public boolean hasMoreItems() {
		// TODO Auto-generated method stub
		if ((count < readConfig.size())) return true;
        else return false;
	}

}