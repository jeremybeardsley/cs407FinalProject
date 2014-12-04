package cs407final.tiles;

/**
 * Concrete WaterTileBuilder Constructs a WaterTile and the various properties 
 * associated with Water Tiles, and returns Tile with getTile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class WaterTileBuilder implements TileBuilder
{
    private Tile tile;

    public WaterTileBuilder() {
        tile = new Tile();
    }

    public void buildPostition()
    {
      
    }

    public void buildTraversable()
    {
        tile.setTraversable(false);
    }

    public void buildFood()
    {
       tile.setFood(false);
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
        return "Water";
    }

}