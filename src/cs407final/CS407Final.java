package cs407final;

import cs407final.creatures.InvalidArgumentException;
import cs407final.environment.Position;
import cs407final.GUI.GameDataSingleton;
import java.util.ArrayList;

public class CS407Final {
    ArrayList<Position> usedSeedSpaces = new ArrayList();
    public static void main(String[] args) throws InvalidArgumentException {
        GameDataSingleton singleton = GameDataSingleton.getInstance();
        int[] boardSize = singleton.getBoardSize();
        int gameWidth = boardSize[0], 
            gameHeight = boardSize[1];
        int[] concreteAnimals = singleton.getConcreteAnimals();
        int cntAnt = concreteAnimals[0],
            cntBear = concreteAnimals[1],
            cntBun = concreteAnimals[2],
            cntHb = concreteAnimals[3],
            cntTrex = concreteAnimals[4],
            cntYeti = concreteAnimals[5];
        int[] disasterChances = singleton.getDisasterChances();
        int volChance = disasterChances[0],
            noxChance = disasterChances[1],
            hurChance = disasterChances[2],
            typhChance = disasterChances[3],
            earthChance = disasterChances[4];
        ArrayList<String> customAnimals = singleton.getCustomAnimals();


        //Build the game Board
        Board gameboard = new Board (gameHeight, gameWidth);
        //Creature Creatures
        Creatures creatures = new Creatures(cntAnt, cntBear, cntBun, cntHb, cntTrex, cntYeti, gameboard);
        
            
//            for (int i=0; i<customAnimals.size(); i++) {
//                String[] s = customAnimals.get(i).split("\\s");
//                Animal animal = af.createAnimal(s[0],
//                                                Integer.parseInt(s[1]),
//                                                Integer.parseInt(s[2]),
//                                                Integer.parseInt(s[3]),
//                                                Integer.parseInt(s[4]),
//                                                Integer.parseInt(s[5]),
//                                                Double.parseDouble(s[6]));
//                setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
//                creatures.add(animal);
//            }
     

     
    }
    
    
    
}
