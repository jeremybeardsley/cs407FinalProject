package cs407final.environment;
import cs407final.tiles.*;
/**
 * Interface Disaster which is implemented by the base disaster class to provide
 * polymorphism for subclasses of DisasterBase.
 * @see DisasterBase
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public interface Disaster {
  public void affectTile(Tile t);
}
