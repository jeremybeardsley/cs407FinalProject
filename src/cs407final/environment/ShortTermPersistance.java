
package cs407final.environment;

/**
 * Class ShortTermPersistance which represents a concrete Persistance property for
 * a natural disaster in the creature creation game.
 * @see Persistance
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */


public class ShortTermPersistance implements Persistance{

    @Override
    public boolean getPersistance() {
       return false;
    }
  
}
