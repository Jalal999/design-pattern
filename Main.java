import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		WindowManager windowManager = WindowManager.getInstance("Simplistic");
		
		ConfigManager cm = new loadConfigFile();
		cm.readFile();
		System.out.println("Loading config file:");
		windowManager.displayUI(cm);
		
		
		ConfigManager cm1 = new loadXMLFile();
		cm1.readFile();
		System.out.println("Loading XML file:");
		windowManager.displayUI(cm1);
		
		System.out.println("\n");
		
//		
//		WindowManager windowManager1 = WindowManager.getInstance("Futuristic");
//		ConfigManager cm2 = new loadConfigFile();
//		cm.readFile();
//		System.out.println("Loading config file:");
//		windowManager.displayUI(cm2);
//		
//		
//		ConfigManager cm3 = new loadXMLFile();
//		cm1.readFile();
//		System.out.println("Loading XML file:");
//		windowManager.displayUI(cm3);
//		
		

	}

}
