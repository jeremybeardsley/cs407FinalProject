package cs407final.creatures;
import java.util.Iterator;

/**
 * Class Head which represents the head of an Animal in the creature creation game.
 * This Animal component can be made up of leaf body parts and/or another AnimalComposite.
 * @see AnimalComposite
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class Head extends AnimalComposite{
  @Override
  protected double getWeightBaseTotal() {
    return 65;
  }
}