package dicegame;

/**
 *
 * @author olek
 */
public abstract class Player {
       
    private String name = "Domyślny Janusz";
       
    public Player() {}
    
    public Player(String name) {
        setName(name);
    }

    /**
     * Abstrakcyjna metoda guess().
     * 
     * @return 
     */
    public abstract int guess();

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
        } else {
            throw new IllegalArgumentException("Nieprawidłowe imię.");
        }
    }
    
}
