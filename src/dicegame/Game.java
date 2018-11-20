package dicegame;

import java.util.Random;

/**
 *
 * @author olek
 */
public class Game {

    protected Player player;
    protected Random rand = new Random();     //obiekt losujący
            
    /**
     * 
     * @param player 
     */
    public void addPlayer(Player player) {
        this.player = player;
    }
    
    /**
     * 
     */
    public void play() {
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            
            System.out.println("Gracz " + player.getName() + ": " + guess);
            
            if (number != guess) {
                System.out.println("PUDŁO!");
            }            
        
        } while (number != guess);

        System.out.println("BRAWO!");

    }
    
}
