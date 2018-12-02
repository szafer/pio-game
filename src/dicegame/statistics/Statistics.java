package dicegame.statistics;

/**
 *
 * @author olek
 */
public interface Statistics {
    
    /**
     * Dopisuje punkt wskazanemu graczowi.
     * 
     * @param name 
     */
    void andTheWinnerIs(String name);
    
    /**
     * Wyświetla statystyki.
     */
    void print();
    
    /**
     * Zeruje statystyki.
     */
    public void reset();
}
