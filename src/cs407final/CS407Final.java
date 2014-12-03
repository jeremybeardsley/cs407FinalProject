package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.InvalidArgumentException;
import cs407final.creatures.AnimalFactory;
import cs407final.environment.Position;
import cs407final.tiles.Tile;
import cs407final.tiles.TileMaker;
import cs407final.GUI.GameDataSingleton;
import java.util.ArrayList;
import java.util.Random;

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
        ArrayList<Position> usedSeedSpaces = new ArrayList();
        
        AnimalFactory af = AnimalFactory.getAnimalFactory();

        //Build the game Board
        Tile[][] gameBoard = new Tile[gameHeight][gameWidth];
        TileMaker tm = new TileMaker();
        Random rn = new Random();

        //Each element of 2D array represents a tile on the game board,
        //For each node, we are rolling a random and MODding 5 to get a semi
        //random int to create the Tile from. 
        for (int i = 0; i < gameHeight; i++) {
            for (int j = 0; j < gameWidth; j++) {
                int randomTile = rn.nextInt(10000) % 5;
                gameBoard[i][j] = tm.TileMaker(randomTile);
            }
        }
        ArrayList<Animal> creatures = new ArrayList();
        //Antelope Creation
        for (int i = 0; i <= cntAnt; i++) {
            Animal animal = af.createAnimal('a');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
        //Bunny Creation
        for (int i = 0; i <= cntBun; i++) {
            Animal animal = af.createAnimal('r');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
        //Bear Creation
         for (int i = 0; i <= cntBear; i++) {
            Animal animal = af.createAnimal('b');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
         //Trex Creation
          for (int i = 0; i <= cntTrex; i++) {
            Animal animal = af.createAnimal('t');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
        //Yeti Creation
           for (int i = 0; i <= cntYeti; i++) {
            Animal animal = af.createAnimal('y');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
           //HoneyBadgerCreation
            for (int i = 0; i <= cntHb; i++) {
            Animal animal = af.createAnimal('h');
            setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
            creatures.add(animal);
        }
            
            for (int i=0; i<customAnimals.size(); i++) {
                String[] s = customAnimals.get(i).split("\\s");
                Animal animal = af.createAnimal(s[0],
                                                Integer.parseInt(s[1]),
                                                Integer.parseInt(s[2]),
                                                Integer.parseInt(s[3]),
                                                Integer.parseInt(s[4]),
                                                Integer.parseInt(s[5]),
                                                Double.parseDouble(s[6]));
                setViablePosition(rn, gameWidth, gameHeight, usedSeedSpaces, animal);
                creatures.add(animal);
            }
     

     
    }
    
    private static void setViablePosition(Random rn, int gameWidth, int gameHeight, ArrayList<Position> usedSeedSpaces1, Animal an) {
        boolean viable = false;
        int posX = 0, posY = 0;
        while (!viable) {
            posX = rn.nextInt(gameWidth - 1) + 1;
            posY = rn.nextInt(gameHeight - 1) + 1;
            for (Position p : usedSeedSpaces1) {
                viable = !(p.xCord == posX && p.yCord == posY);
            }
        }
        an.setPosition(posX, posY);
    }
    
}
