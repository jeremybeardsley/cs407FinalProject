package cs407final.environment;
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
