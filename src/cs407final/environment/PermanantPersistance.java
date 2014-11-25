package cs407final.environment;

/**
 * Concrete transmission class
 */
public class PermanantPersistance implements Persistance{

    @Override
    public boolean getPersistance() {
        return true;
    }
  
}
