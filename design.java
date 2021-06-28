
import java.util.*;

/**
 * 
 */
public abstract class design {


    /**
     * 
     */
    displayUI chooseDisplayType(String type) {
        displayUI display = passDisplayType(type);
        return display;
    }

    /**
     * 
     */
    abstract displayUI passDisplayType(String type);
}