package cs407final.environment;

public class Main {
  public static void main(String[] args){
    
    
    NaturalDisasterFactory naturaldisasterFactory = new Vesuvius();
    Disaster disaster1 = naturaldisasterFactory.makeDisaster("Minor");
    Disaster disaster2 = naturaldisasterFactory.makeDisaster("Medium");
    Disaster disaster3 = naturaldisasterFactory.makeDisaster("Major");
    
    naturaldisasterFactory = new StHelens();
    disaster1 = naturaldisasterFactory.makeDisaster("Minor");
    disaster2 = naturaldisasterFactory.makeDisaster("Medium");
    disaster3 = naturaldisasterFactory.makeDisaster("Major");
    
    
  }  
}
