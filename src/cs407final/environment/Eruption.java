package cs407final.environment;

/**
 * Class Eruption which is one type of natural disaster affecting the game board
 * in the creature creation game. This class extends the DisasterBase abstract 
 * class.
 * @see DisasterBase
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
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
