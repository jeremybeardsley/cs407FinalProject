package cs407final.environment;

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
