package cs407final;

/**
 * Class Body which represents the body of an Animal in the creature creation game.
 * This Animal component can be made up of leaf body parts (such as Head or Legs)
 * and/or another AnimalComposite.
 * @see AnimalComposite
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class Body extends AnimalComposite{
  @Override
  protected double getWeightBaseTotal() {
    return 150;
  }
}
