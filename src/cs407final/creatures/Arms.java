package cs407final.creatures;

/**
 * Class Arms which represents the arms of an Animal in the creature creation game.
 * This Animal component is a leaf and therefore cannot be made up of any other 
 * component or composite.
 * @see AnimalComponent
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class Arms extends AnimalComponent{

  @Override
  public double getWeightTotal() {
    return 50;
  }
  
}
