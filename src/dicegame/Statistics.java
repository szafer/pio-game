
package dicegame;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author olek
 */
public class Statistics {

    private final Map<String, Integer> stats = new HashMap();
    
    /**
     * 
     * @param name 
     */
    public void andTheWinnerIs(String name) {
        int score = stats.getOrDefault(name, 0);
        ++score;
        stats.put(name, score);
    }
    
    /**
     * 
     */
    public void print() {
        for (String name : stats.keySet()) {
            System.out.println(name + ": " + stats.get(name));
        }
    }
    
    /**
     * 
     */
    public void reset() {
        stats.clear();
    }

    
}
