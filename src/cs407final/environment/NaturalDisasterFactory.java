package cs407final.environment;

/**
 * Interface NaturalDisasterFactory which provides an abstract framework for a 
 * disaster factory to create natural disasters in the creature creation game.
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public interface NaturalDisasterFactory {
  public Disaster makeDisaster(String parameters);
}
