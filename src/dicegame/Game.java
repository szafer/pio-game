package dicegame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author olek
 */
public class Game {

    protected List<Player> players = new ArrayList();
            
    protected Random rand = new Random();     //obiekt losujący
            
    /**
     * 
     * @param player 
     */
    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        } else {
            throw new IllegalArgumentException("Gracz nie może być null.");
        }
    }
    
    /**
     * 
     */
    public void play() {
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        boolean oneMore;
        
        do {
            oneMore = true;
            
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess();

                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    oneMore = false;
                    System.out.println("BRAWO!");
                }            
            }
        
        } while (oneMore);

        

    }
    
}
