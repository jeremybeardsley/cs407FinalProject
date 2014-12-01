package cs407final.creatures;

/**
 * Class Antelope which represents a concrete Animal in the creature creation game.
 * This class extends the Animal abstract class, and has a MovementStrategy of the 
 * subclass FlightMoveStrategy, as well as the ability to eat and move.
 * @see FlightMoveStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Antelope extends Animal {

    @Override
    public void move() {
        System.out.println("Antelope moves!");
    }

    @Override
    public void eat() {
        System.out.println("Antelope eats!");
    }

    @Override
    protected void burnCalories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void checkAdjacents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
