package dicegame;

import dicegame.players.PlayerComp;
import dicegame.statistics.Statistics;
import dicegame.statistics.WinStatistics;

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

        Statistics stats = new WinStatistics();
        
        Game game = new Game(stats);

        game.addPlayer(new PlayerComp("Janusz"));
        game.addPlayer(new PlayerComp("Marian"));
        game.addPlayer(new PlayerComp("Ziuta"));
        
        for (int i=0; i<100; ++i) {
            game.play();
        }
        
        System.out.println("******** STATYSTYKI *********");
        stats.print();
        
    }
    
}
