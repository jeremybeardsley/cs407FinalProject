package cs407final.tiles;
/**
 * Concrete TundraTileBuilder Constructs a TundraTile and the various properties 
 * associated with Tundra Tiles, and returns Tile with getTile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class TundraTileBuilder implements TileBuilder
{
    private Tile tile;

    public TundraTileBuilder() {
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
        return "Tundra";
    }

}