package cs407final.tiles;
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