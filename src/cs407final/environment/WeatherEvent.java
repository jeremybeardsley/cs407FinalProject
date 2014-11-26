package cs407final.environment;

/**
 * Class WeatherEvent which represents a DisasterStrategy in the creature creation
 * game.
 * @see DisasterStrategy
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public class WeatherEvent implements DisasterStrategy{
  
  public Disaster makeDisaster(String parameters) {
    if (parameters.equals("Hurricane")){
      return new Hurricane();
    }else{
      return new Typhoon();
    }
  }

    @Override
    public void affectTile(Tile t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
