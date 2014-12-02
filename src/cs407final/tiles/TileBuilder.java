package cs407final.tiles;
public interface TileBuilder
{

   public void buildPostition();

	public void buildTraversable();

	public void buildFood();

	public void buildToxicity();

    public Tile getTile();
}