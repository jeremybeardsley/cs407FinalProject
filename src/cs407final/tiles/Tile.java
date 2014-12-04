package cs407final.tiles;
import cs407final.environment.Position;

/**
 * Tile Class. Represents the properties of a Tile.
 * 
 * @author Jeremy Beardsley, Matt LeClerc, Andrew McCoy, Andrew Possardt
 * @version 1.0
 * @since 11-24-14
 */
public class Tile 
{

    private boolean food;
    private boolean traversable;
    private boolean toxic;
    private Position position;

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean getTraversable() {
        return traversable;
    }

    public void setTraversable(boolean traversable) {
        this.traversable = traversable;
    }

    public boolean getToxic() {
        return toxic;
    }

    public void setToxic(boolean toxic) {
        this.toxic = toxic;
    }
    public void setPosition(Position pos){
        this.position = pos;
    }
    public Position getPosition(){
        return position;
    }
    public String toString() {
        return "Food: " + food + ", Traversable: " + traversable + ", Toxic: " + toxic;
    }

}

