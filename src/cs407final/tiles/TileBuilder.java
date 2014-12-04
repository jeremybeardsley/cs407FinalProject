package cs407final.tiles;

/**
 * TileBuilder Interface this outlines methods used to build Tiles and method
 * to return Tile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public interface TileBuilder
{

   public void buildPostition();

	public void buildTraversable();

	public void buildFood();

	public void buildToxicity();

    public Tile getTile();
}