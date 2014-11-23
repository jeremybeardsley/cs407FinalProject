
package cs407final.creatures;

/**
 * Class Bear which represents a concrete Animal in the creature creation game.
 * This class extends the Animal abstract class, and has a MovementStrategy of the 
 * subclass RandomMoveStrategy, as well as the ability to eat and move.
 * @see RandomMoveStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Bear extends Animal{
    
    @Override
    public void move() {
        
        System.out.println("Bear moved!");
    }

    @Override
    public void eat() {
        System.out.println("Bear Ate!");
    }
    
}
