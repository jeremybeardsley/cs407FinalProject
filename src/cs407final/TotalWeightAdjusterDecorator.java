package cs407final;
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