package cs407final.creatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Abstract class AnimalComposite which represents a container for all body parts 
 * related to a composite body part (such as Body). Additional composites or leaf 
 * body parts (such as Head) can be added to the AnimalComposite.
 * @see AnimalComponent
 * @see Body
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public abstract class AnimalComposite extends AnimalComponent{
  protected List<AnimalComponent> bodyParts = new ArrayList<AnimalComponent>();
  public AnimalComposite composite(){
    return this;
  }
  public void add(AnimalComponent component){
    bodyParts.add(component);
  }
  public void remove(AnimalComponent component){
    bodyParts.remove(component);
  }
  public Iterator<AnimalComponent> iterator(){
    return bodyParts.iterator();
  }

  /**
   * Note implemented as template pattern
   * @return weight total of this component plus all contained classes
   */
  @Override
  public double getWeightTotal() {
    double weightTotal = getWeightBaseTotal();
    Iterator<AnimalComponent> subIter = bodyParts.iterator();
    while (subIter.hasNext()){
      AnimalComponent animalComp = subIter.next();
      weightTotal += animalComp.getWeightTotal();
    }
    return weightTotal;
  }
  protected abstract double getWeightBaseTotal();

}
