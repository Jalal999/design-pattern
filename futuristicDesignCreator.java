
import java.util.*;

/**
 * 
 */
public class futuristicDesignCreator extends displayUI {
	int num = 3;
	String designType = "Futuristic";

    /**
     * Default constructor
     */
    public futuristicDesignCreator(String UIitems) {
    	designType = designType;
    	UI_items = UIitems.split(",");
    	
    }

	@Override
	void displayUIitems() {
		// TODO Auto-generated method stub
		System.out.println("Design type is :" + designType);
        String itemType = UI_items[0];
        String itemValue = UI_items[1];
        String x_cord = UI_items[2].substring(num);
        String y_cord = UI_items[3].substring(num);
        System.out.println(itemType + ", " + itemValue + ", X:" + x_cord + ", Y:" + y_cord);

	}

}