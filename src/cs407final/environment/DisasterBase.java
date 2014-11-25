package cs407final.environment;
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
