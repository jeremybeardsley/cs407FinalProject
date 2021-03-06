package cs407final.environment;

/**
 * Class StHelens which represents a concrete NaturalDisasterFactory in the creature
 * creation game. This factory creates a natural disaster with fallout and persistance
 * based on string input.
 * @see NaturalDisasterFactory
 * @see Fallout
 * @see Persistance
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public class StHelens implements NaturalDisasterFactory {

  @Override
  public Disaster makeDisaster(String parameters) {
    if (parameters.equals("Minor")) {
      Fallout fallout = new Fallout(true, false);
      Persistance persistance = new ShortTermPersistance();
      return new NoxiousGasVolcanicEruption(fallout.getFallout(),persistance.getPersistance());
    } else if(parameters.equals("Medium")){
      Fallout fallout = new Fallout(true, false);
      Persistance persistance = new ShortTermPersistance();
      return new LavaEruption(fallout.getFallout(), persistance.getPersistance());
    } else if(parameters.equals("Major")){
     Fallout fallout = new Fallout(true, true);
      Persistance persistance = new PermanantPersistance();
      return new Earthquake(fallout.getFallout(), persistance.getPersistance());
    } else {
       //Default StHelens Event
        Fallout fallout = new Fallout(true, false);
      Persistance persistance = new ShortTermPersistance();
      return new Eruption(true, false);
    }
  }
}
