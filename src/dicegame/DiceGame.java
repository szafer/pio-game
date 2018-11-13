package dicegame;

import java.util.Random;

/**
 * Gra w odgadywanie wylosowanej liczby.
 * 
 * Zasady:
 * - komputer rzuca kostką (losuje liczby z zakresu 1..6)
 * - gracz (też komputer) stara się odgadnąć liczbę (też losuje)
 * - jeżeli odgadnie, gra się kończy
 * - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Player player = new PlayerComp();
        
        try {
            
            player.setName("3dek");
            
        } catch (IllegalArgumentException ex) {
            System.err.println("Błąd! " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("Nieznany błąd. Skontaktuj się z administratorem.");
        }
        
        Random rand = new Random();     //obiekt losujący
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
