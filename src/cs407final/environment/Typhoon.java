package cs407final.environment;

/**
 * Class Typhoon which represents a concrete natural disaster in the creature creation 
 * game. A typhoon is classified as a WeatherEvent as compared to a Seismic Event.
 * @see DisasterBase
 * @see WeatherEvent
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public class Typhoon extends DisasterBase{

  public Typhoon(){
    super(new WeatherEvent());
  }
 
}
