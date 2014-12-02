package cs407final.tiles;
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