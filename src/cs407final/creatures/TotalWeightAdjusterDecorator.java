package cs407final.creatures;

/**
 * Class TotalWeightAdjustorDecorator which represents an AnimalComponentDecorator
 * for changing the total weight of an Animal.
 * @see AnimalComponentDecorator
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public class TotalWeightAdjusterDecorator extends AnimalComponentDecorator {
  public TotalWeightAdjusterDecorator(AnimalComponent decoratedComponent){
    super(decoratedComponent);
  }
  
  /**
   * Implements added behavior
   */
  protected double getWeightTotalAdjustment(){
    
    return .50;
  }
  
  @Override
  public double getWeightTotal(){
    double original =  decoratedComponent.getWeightTotal();
    return original * getWeightTotalAdjustment();
  }
}