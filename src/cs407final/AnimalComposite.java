package cs407final;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
   * @return price total of this component plus all contained classes
   */
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
