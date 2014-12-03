
package cs407final.creatures;

import java.util.Random;

/**
 * Class RandomMoveStrategy which represents an animal's random movement unrelated to 
 * any other animal in the creature creation game. FlightMoveStrategy implements the 
 * MovementStrategy interface.
 * @see MovementStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class RandomMoveStrategy implements MovementStrategy{

    @Override
    public boolean move() {
        Random rn = new Random();
        int temp = rn.nextInt(1000)%2;
        return temp != 1;
    }

   
    
}
