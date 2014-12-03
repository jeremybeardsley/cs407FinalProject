
package cs407final;

import cs407final.tiles.Tile;
import cs407final.tiles.TileMaker;
import java.util.Random;

/**
 *
 * @author Bear
 */
public class Board {
    public Tile[][]gameBoard;
    public int height, width;
    public Board(int gameHeight, int gameWidth){
        height = gameHeight;
        width = gameWidth;
        gameBoard = new Tile[height][width];
        TileMaker tm = new TileMaker();
        Random rn = new Random();

        //Each element of 2D array represents a tile on the game board,
        //For each node, we are rolling a random and MODding 5 to get a semi
        //random int to create the Tile from. 
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int randomTile = rn.nextInt(10000) % 5;
                gameBoard[i][j] = tm.TileMaker(randomTile);
            }
        }
    }
}
