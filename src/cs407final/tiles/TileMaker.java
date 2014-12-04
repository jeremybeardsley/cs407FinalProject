package cs407final.tiles;

/**
 * Tilemaker should be considered the Driver class for Tile Creation.  When the
 * gameboard was being created, it was easier to just call TileMaker with a param
 * and let this class handle the logistics of which Tile to build, based on the 
 * argument. 
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class TileMaker {

    /**
     *
     * @param i
     * @return
     */
    public Tile TileMaker(int i) {

        switch (i) {
            case 1:
                TileBuilder tileBuilder = new DesertTileBuilder();
                TileDirector tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();

            case 2:
                tileBuilder = new ForestTileBuilder();
                tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();

            case 3:
                tileBuilder = new MountainTileBuilder();
                tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();

            case 4:
                tileBuilder = new TundraTileBuilder();
                tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();

            case 5:
                tileBuilder = new WaterTileBuilder();
                tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();
            default:
                tileBuilder = new ForestTileBuilder();
                tileDirector = new TileDirector(tileBuilder);
                tileDirector.constructTile();
                return tileDirector.getTile();
        }
    }
}
