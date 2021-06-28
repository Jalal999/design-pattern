
import java.io.IOException;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/**
 * 
 */
public class loadXMLFile implements ConfigManager {
	ArrayList<String> readConfig;
	int count;

    /**
     * Default constructor
     */
    public loadXMLFile() {
    }

	@Override
	public
	void readFile() throws IOException, ParserConfigurationException, SAXException {
		DocumentBuilderFactory documentBuilder = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilder.newDocumentBuilder();
        Document document = builder.parse("config.xml");
        
        readConfig = new ArrayList<>();
        Node node;
        Element element = document.getDocumentElement();
        node = element.getFirstChild().getNextSibling();
        while (node != null) {
            Element eElement = (Element) node;
            String item = eElement.getTagName() + ", " + eElement.getAttribute("value") + ", X: " + eElement.getAttribute("X") + ", Y: " + eElement.getAttribute("Y");
            readConfig.add(item);
            node = node.getNextSibling().getNextSibling();
        }
		
	}
	
	public String nextItem() {
        return readConfig.get(count++);
    }
	
	
	public boolean hasMoreItems() {
        if ((count < readConfig.size())) return true;
    
        else return false;
    }
	
	
}

