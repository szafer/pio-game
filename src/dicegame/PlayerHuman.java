package dicegame;

import java.util.Scanner;

/**
 *
 * @author olek
 */
public class PlayerHuman extends Player {

    Scanner cin = new Scanner(System.in);
    
    /*
     * Konstruktory 
     */
    public PlayerHuman() {}
    
    public PlayerHuman(String name) {
        super(name);
    }
    
    /**
     * Metoda "odgadująca" -- liczba podawana w konsoli.
     * 
     * @return 
     */
    @Override
    public int guess() {
        System.out.print("Wpisz liczbę (1-6): ");
        return cin.nextInt();
    }
    
}
