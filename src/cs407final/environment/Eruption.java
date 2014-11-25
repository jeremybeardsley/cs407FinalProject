package cs407final.environment;

/**
 * Concrete vehicle class
 */
public class Eruption extends DisasterBase{
  boolean fallout;
  boolean persistance;
  public Eruption(boolean fallout, boolean persistance){
    super(new SeismicEvent());
    this.fallout = fallout;
    this.persistance = persistance;

  }


  public boolean getFallout() {
    return fallout;
  }
  
  public boolean getPersistance(){
    return persistance;
  }

}
