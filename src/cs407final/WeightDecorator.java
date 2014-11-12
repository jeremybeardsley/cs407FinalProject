package cs407final;
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