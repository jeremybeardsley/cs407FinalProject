
package cs407final.environment;

/**
 * Class TileProperty which represents the type of landscape (Desert, Plains, Mountain,
 * Forest, or Water) that a tile can have.
 * @see Tile
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */


public class TileProperty {
    private final String description;
    public static final TileProperty DESERT = new TileProperty("Desert");
    public static final TileProperty PLAINS = new TileProperty("Plains");
    public static final TileProperty MOUNTAIN= new TileProperty("Mountain");
    public static final TileProperty FOREST= new TileProperty("Forest");
     public static final TileProperty WATER = new TileProperty("Water");

    public TileProperty(String description){
        this.description = description;
    }

    public String toString(){
        return description;
    }
}
