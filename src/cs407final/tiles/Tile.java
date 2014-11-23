/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.tiles;
public class Tile {
    private TileProperty tileProperty;  
    private boolean food, isTraversable, up, down, left, right;
    private String direction;     
    private int x,y;

    private Tile(TileBuilder builder) {
        this.food = builder.food;
        this.isTraversable = builder.isTraversable;
        this.tileProperty= builder.tileProperty;
        this.x = builder.x;
        this.y = builder.y;
        this.up = builder.up;
        this.down = builder.up;
        this.left = builder.up;
        this.right = builder.up;
    }

    public static class TileBuilder {
        // required parameters
        private boolean up = false;
        private boolean down = false;
        private boolean left = false;
        private boolean right = false;
        private TileProperty tileProperty = null;
        private int x = 0;
        private int y = 0;
        private boolean isTraversable = false;
        private boolean food = false;

        public TileBuilder(boolean up, boolean down, boolean left, boolean right, int x, int y, boolean isTraversable, boolean food){
            this.food = food;
            this.isTraversable = isTraversable;
            this.tileProperty = tileProperty;
            this.x = x;
            this.y = y;
            this.up = up;
            this.down = down;
            this.left = left;
            this.right = right;
        }

        public Tile buildTile(){
            return new Tile(this);
        }

        public TileBuilder setTile(TileProperty tileProperty ){
            this.tileProperty =tileProperty;
            return this;
        }

        public String toString()
        {     
            String s = "Tile [" + tileProperty + "] "  + "Up: " + up + " Down: " + down  + " Left: " + left + " Right: " + right + " Value of X: " + x + " Value of Y: " + y + " Traversable? " + isTraversable 
            + " Is there food? " + food + "]";
            return s;
        }

    }
}
