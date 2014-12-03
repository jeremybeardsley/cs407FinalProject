package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.InvalidArgumentException;
import cs407final.creatures.AnimalFactory;
import cs407final.environment.Position;
import cs407final.tiles.Tile;
import cs407final.tiles.TileMaker;
import java.util.ArrayList;
import java.util.Random;

public class CS407Final {
    ArrayList<Position> usedSeedSpaces = new ArrayList();
    public static void main(String[] args) throws InvalidArgumentException {
        int gameWidth = 10, gameHeight = 10;
        int cntAnt = 6, cntBun = 3, cntTrex = 1, cntBear = 5, cntHb = 1, cntYeti = 1;
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
