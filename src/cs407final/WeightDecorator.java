package cs407final;

/**
 * Class WeightDecorator which represents an AnimalComponentDecorator
 * for changing the weight of a specific AnimalComponent of an Animal.
 * @see AnimalComponentDecorator
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class WeightDecorator extends AnimalComponentDecorator{
  protected double percentOfOriginal;
  public WeightDecorator(double percentOfOriginal, AnimalComponent decoratedComponent){
    super(decoratedComponent);
    this.percentOfOriginal = percentOfOriginal;
  }
  
  @Override
  public double getWeightTotal(){
    return percentOfOriginal * decoratedComponent.getWeightTotal();
  }
}