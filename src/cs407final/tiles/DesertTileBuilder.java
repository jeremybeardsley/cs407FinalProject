package cs407final.tiles;
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
