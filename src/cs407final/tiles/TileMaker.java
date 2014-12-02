/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.tiles;

/**
 *
 * @author Bear
 */
public class TileMaker {

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
