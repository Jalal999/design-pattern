
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

/**
 * 
 */
public interface ConfigManager {
	
	
	public String nextItem();
	
	public boolean hasMoreItems();
  
	
	void readFile() throws IOException, ParserConfigurationException, SAXException;
	
}