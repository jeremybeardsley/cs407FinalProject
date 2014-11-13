package cs407final;

/**
 * Abstract class AnimalComponent which provides the framework for the composite and leaf classes.
 * @see AnimalComposite
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-12-2014
 */
public abstract class AnimalComponent {
  public abstract double getWeightTotal();
  
  public AnimalComposite composite(){
    return null;
  }
}
