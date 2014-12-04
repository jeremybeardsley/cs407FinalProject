package cs407final.tiles;

/**
 * Director Class.  Accepts TileBuilder as a parameter, and builds tiles differently
 * based on the Builder that is passed to it. constructTile assembles the tiles.
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class TileDirector {

	private TileBuilder tileBuilder = null;

	public TileDirector(TileBuilder tileBuilder) {
		this.tileBuilder = tileBuilder;
	}

	public void constructTile() {
		tileBuilder.buildFood();
		tileBuilder.buildToxicity();
		tileBuilder.buildTraversable();
	}

	public Tile getTile() {
		return tileBuilder.getTile();
	}

}