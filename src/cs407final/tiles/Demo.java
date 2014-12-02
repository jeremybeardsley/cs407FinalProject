package cs407final.tiles;

public class Demo {

	public static void main(String[] args) {

		TileBuilder tileBuilder = new DesertTileBuilder();
		TileDirector tileDirector = new TileDirector(tileBuilder);
		tileDirector.constructTile();
		Tile tile = tileDirector.getTile();
		System.out.println("Tile is: " + tileBuilder + ", PROPERTIES: " + tile);
		System.out.println();
		
		tileBuilder = new ForestTileBuilder();
		tileDirector = new TileDirector(tileBuilder);
		tileDirector.constructTile();
		tile = tileDirector.getTile();
		System.out.println("Tile is: " + tileBuilder + ", PROPERTIES: " + tile);
		System.out.println();
		
		tileBuilder = new MountainTileBuilder();
		tileDirector = new TileDirector(tileBuilder);
		tileDirector.constructTile();
		tile = tileDirector.getTile();
		System.out.println("Tile is: " + tileBuilder + ", PROPERTIES: " + tile);
		System.out.println();
		
		tileBuilder = new TundraTileBuilder();
		tileDirector = new TileDirector(tileBuilder);
		tileDirector.constructTile();
		tile = tileDirector.getTile();
		System.out.println("Tile is: " + tileBuilder + ", PROPERTIES: " + tile);
		System.out.println();
		
		tileBuilder = new WaterTileBuilder();
		tileDirector = new TileDirector(tileBuilder);
		tileDirector.constructTile();
		tile = tileDirector.getTile();
		System.out.println("Tile is: " + tileBuilder + ", PROPERTIES: " + tile);
		System.out.println();
	}

}