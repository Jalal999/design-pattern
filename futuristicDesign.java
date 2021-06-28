
import java.util.*;

/**
 * 
 */
public class futuristicDesign extends design {

    /**
     * Default constructor
     */
    public futuristicDesign() {
    }

	@Override
	displayUI passDisplayType(String type) {
		// TODO Auto-generated method stub
		return new futuristicDesignCreator(type);
	}

}