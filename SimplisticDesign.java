
import java.util.*;

/**
 * 
 */
public class SimplisticDesign extends design {

    /**
     * Default constructor
     */
    public SimplisticDesign() {
    }

	@Override
	displayUI passDisplayType(String type) {
		// TODO Auto-generated method stub
		return new simplisticDesignCreator(type);
	}

}