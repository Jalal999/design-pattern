
import java.util.*;

/**
 * 
 */
public class HighDetailedDesign extends design {

    /**
     * Default constructor
     */
    public HighDetailedDesign() {
    }

	@Override
	displayUI passDisplayType(String type) {
		// TODO Auto-generated method stub
		return new highDesginCreator(type);
	}

}