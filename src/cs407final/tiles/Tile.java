package cs407final.tiles;
import cs407final.environment.Position;
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
    public String toString() {
        return "Food: " + food + ", Traversable: " + traversable + ", Toxic: " + toxic;
    }

}

