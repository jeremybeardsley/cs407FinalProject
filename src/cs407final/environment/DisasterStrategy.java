package cs407final.environment;

/**
 * Interface DisasterStrategy which provides the framework for a disaster strategy 
 * for a natural disaster in the creature creation game.
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public interface DisasterStrategy {
  public void affectTile(Tile t);
}
