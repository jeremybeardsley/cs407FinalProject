package cs407final.environment;
import cs407final.tiles.*;
/**
 * Abstract class DisasterBase which provides framework for all natural disasters which 
 * affect the game board and creatures on it in the creature creation game. Each disaster
 * has a DisasterStrategy which can be a SeismicEvent or WeatherEvent.
 * @see Disaster
 * @see DisasterStrategy
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

abstract class DisasterBase implements Disaster{
  private DisasterStrategy disasterStrategy;
  
  public DisasterBase(DisasterStrategy disasterStrategy){
    this.disasterStrategy = disasterStrategy;
  }
  
  protected void setDisasterStrategy(DisasterStrategy disasterStrategy){
    this.disasterStrategy = disasterStrategy;
  }
  
  protected DisasterStrategy getDisasterStrategy(){
    return disasterStrategy;
  }
  
  @Override
  public void affectTile(Tile t){
    
  }
}
