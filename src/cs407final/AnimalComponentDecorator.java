package cs407final;
public abstract class AnimalComponentDecorator extends AnimalComponent{
  protected final AnimalComponent decoratedComponent;
  
  public AnimalComponentDecorator(AnimalComponent decoratedComponent){
    this.decoratedComponent = decoratedComponent;
  }
  
  @Override
  public double getWeightTotal(){
    return decoratedComponent.getWeightTotal();
  }
  
  @Override
  public AnimalComposite composite(){
    return decoratedComponent.composite();
  }
}