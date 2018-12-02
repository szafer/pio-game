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
       
    protected Statistics stats;

    /**
     * Konstruktor przyjmujący obiekt statystyk.
     * 
     * @param stats 
     */
    public Game(Statistics stats) {
        this.stats = stats;
    }
    
    /**
     * 
     * @param player 
     */
    public void addPlayer(Player player) {
        if (player != null) {
            
            if (!nameExists(player.getName())) {
                players.add(player);
            } else {
                player.setName(player.getName() + rand.nextInt(10));
                addPlayer(player);
            }            
        } else {
            throw new IllegalArgumentException("Gracz nie może być null.");
        }
    }
    
    private boolean nameExists(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     */
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    
    /**
     * 
     * @param name 
     */
    public void removePlayer(String name) {
        
//      Klasyczne rozwiązanie z pętlą while ma tę wadę, że obiekt iteratora jest
//      widoczny w całej metodzie.
        // Iterator<Player> it = players.iterator();
        // while (it.hasNext()) {
        
//      Wrzucenie inicjalizacji iteratora i wywołanie hasNext() do pętli for
//      rozwiązuje ten problem.
        for (Iterator<Player> it = players.iterator() ; it.hasNext(); ) {
            Player player = it.next();
            if (player.getName().equals(name)) {
                it.remove();
                break;
            }
        }
        
//      W Java 8 zostało wprowadzonych sporo udogodnień.
//      Między innymi dostajemy metodę removeIf(), która pozwala na
//      zgrabne rozwiązanie problemu usuwania graczy o danym imieniu.
//      Dodatkowo do poczytania: wyrażenia lambda.
        // players.removeIf(player -> player.getName().equals(name));
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
                    stats.andTheWinnerIs(player.getName()); // doliczenie punktu
                    System.out.println("BRAWO!");
                }            
            }
        
        } while (oneMore);

    }
    
}
