package cs407final.tiles;

/**
 * Concrete ForestTileBuilder Constructs a ForestTile and the various properties 
 * associated with Forest Tiles, and returns Tile with getTile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class ForestTileBuilder implements TileBuilder
{
    private Tile tile;

    public ForestTileBuilder() {
        tile = new Tile();
    }

    public void buildPostition()
    {
      
    }

    public void buildTraversable()
    {
        tile.setTraversable(true);
    }

    public void buildFood()
    {
       tile.setFood(true);
    }

    public void buildToxicity()
    {
      tile.setToxic(false);
    }

    public Tile getTile()
    {
      return tile;
    }

     public String toString()
    {
        return "Forest";
    }

}