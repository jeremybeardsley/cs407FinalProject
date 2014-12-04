
package cs407final;

import cs407final.tiles.Tile;
import cs407final.tiles.TileMaker;
import java.util.Random;

/**
 * Class Board which represents the game board. 
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Board {

 
    public Tile[][]gameBoard;
    public int height,width;

    /**
     *This method creates a new Board based on size params passed in.
     * 
     * @param gameHeight
     * @param gameWidth
     */
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
