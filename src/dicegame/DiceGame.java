package dicegame;

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

        Game game = new Game();
        
        Player player = new PlayerComp("Janusz");
                
        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Marian"));
        game.addPlayer(new PlayerComp("Ziuta"));
                       
        game.removePlayer("Marian");
        
        game.printPlayers();
        
        game.play();
    }
    
}
