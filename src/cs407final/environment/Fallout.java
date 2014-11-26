package cs407final.environment;

/**
 * Class Fallout which represents a property for a natural disaster in the creature
 * creation game. Fallout can kill life on a tile or change the tile's state.
 * 
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */

public class Fallout {
  private final boolean killLife;
  private final boolean changeTile;
  public Fallout(boolean killLife,boolean changeTile){
    this.killLife = killLife;
    this.changeTile = changeTile;
  }
  
  public boolean getFallout(){
    if (killLife || changeTile)
        return true;
    else
        return false;
  }
}
