package cs407final.environment;

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
