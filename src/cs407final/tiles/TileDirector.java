package cs407final.tiles;
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