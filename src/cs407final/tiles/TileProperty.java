/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.tiles;
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
