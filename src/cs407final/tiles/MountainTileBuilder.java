package cs407final.tiles;
public class MountainTileBuilder implements TileBuilder
{
    private Tile tile;

    public MountainTileBuilder() {
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
        return "Mountain";
    }


}