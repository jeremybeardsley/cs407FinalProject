package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.InvalidArgumentException;
import cs407final.creatures.AnimalFactory;
import cs407final.tiles.Tile;
import cs407final.tiles.TileMaker;
import java.util.Random;

public class CS407Final {

    public static void main(String[] args) throws InvalidArgumentException {
        int gameWidth = 10, gameHeight=10;
        Tile[][] gameboard = new Tile[10][10];
        TileMaker tm = new TileMaker();
        Random rn = new Random();
        for (int i = 0; i <gameHeight; i++){
            for (int j = 0; j<gameWidth; j++)
            {
               int randomTile = rn.nextInt(10000)%5;
                gameboard[i][j] = tm.TileMaker(randomTile);
            }
        }
        
        AnimalFactory af = AnimalFactory.getAnimalFactory();
        Animal yogi = af.createAnimal('b');
        Animal gnu = af.createAnimal('a');
        Animal t = af.createAnimal('t');

        //yogi.takeTurn();
        //gnu.takeTurn();
        //t.takeTurn();
        yogi.getStats();
        gnu.getStats();
        t.getStats();
    }

}
