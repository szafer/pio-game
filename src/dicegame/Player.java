package dicegame;

import java.util.Random;

/**
 *
 * @author olek
 */
public class Player {
       
    private String name = "Domyślny Janusz";
    
    private final Random rand = new Random();
    
    public Player() {}
    
    public Player(String name) {
        setName(name);
    }

    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     * 
     * @return liczb oczek (1-6)
     */
    public int guess() {
        return rand.nextInt(6) + 1;
    }

    /**
     * Geter pola name.
     * 
     * @return imię gracza
     */
    public String getName() {
        return name;
    }

    /**
     * Seter pola name.
     * 
     * Sprawdza poprawność danych (nie null i niepuste).
     * 
     * @param name imię gracza
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
}
