package dicegame;

import java.util.Random;

/**
 *
 * @author olek
 */
public class Player {
       
    private Random rand = new Random();
    
    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     * 
     * @return liczb oczek (1-6)
     */
    public int guess() {
        return rand.nextInt(6) + 1;
    }
    
}
