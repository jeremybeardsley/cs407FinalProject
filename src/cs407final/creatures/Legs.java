package cs407final.creatures;

/**
 * Class Legs which represents the legs of an Animal in the creature creation game.
 * This Animal component is a leaf and therefore cannot be made up of any other 
 * component or composite.
 * @see AnimalComponent
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class Legs extends AnimalComponent{

  public double getWeightTotal() {
    return 75;
  }  
}
