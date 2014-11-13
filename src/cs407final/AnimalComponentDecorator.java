package cs407final;

/**
 * Abstract class AnimalComponentDecorator which provides the framework for creating
 * a decorator to change AnimalComponent properties of a specific Animal.
 * @see AnimalComponent
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
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