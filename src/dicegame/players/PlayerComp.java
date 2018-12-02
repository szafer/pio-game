package dicegame.players;

import java.util.Random;

/**
 *
 * @author olek
 */
public class PlayerComp extends Player {
    
    private final Random rand = new Random(); 
    
    /*
     * Konstruktory
     */
    public PlayerComp() {
    }

    public PlayerComp(String name) {
        super(name);
    }

    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     * 
     * @return liczb oczek (1-6)
     */
    @Override
    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
