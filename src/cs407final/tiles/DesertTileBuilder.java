package cs407final.tiles;

/**
 * Concrete DesertTileBuilder Constructs a DesertTile and the various properties 
 * associated with Desert Tiles, and returns Tile with getTile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class DesertTileBuilder implements TileBuilder
{
    private Tile tile;

    public DesertTileBuilder() {
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
        return "Desert";
    }

}
