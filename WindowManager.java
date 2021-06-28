
import java.util.*;


/**
 * 
 */
public class WindowManager {
	 /**
     * 
     */
    private static WindowManager windowManager = new WindowManager();

    /**
     * 
     */
    public static design designType;

	

    /**
     * Default constructor
     */
    private WindowManager() {
    	
    }
    

 

    /**
     * @return
     */
    public static WindowManager getInstance(String designType) {
        // TODO implement here
    	designType(designType);
        return windowManager;
    }

    /**
     * 
     */
    public static void designType(String type) {
       
    	if (type.equals("Simplistic")) {
    		designType = new SimplisticDesign();
        }else if (type.equals("High Detailed")) {
        	designType = new HighDetailedDesign();
        }else if (type.equals("Futuristic")) {
        	designType = new futuristicDesign();
        }
    }

    /**
     * 
     */
    public void displayUI(ConfigManager cm) {
        // TODO implement here
    	while (cm.hasMoreItems()) {
    		displayUI UI = designType.chooseDisplayType(cm.nextItem());
    		UI.displayUIitems();
    		
    	}
    }

}