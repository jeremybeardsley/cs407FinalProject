package cs407final.environment;

/**
 * Class Hurricane which represents a concrete natural disaster in the creature creation 
 * game. A hurricane is classified as a WeatherEvent as compared to a Seismic Event.
 * @see DisasterBase
 * @see WeatherEvent
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public class Hurricane extends DisasterBase{
  public Hurricane(){
    super(new WeatherEvent());
  }

}
