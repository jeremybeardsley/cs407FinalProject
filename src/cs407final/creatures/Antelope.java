package cs407final.creatures;

/**
 * Class Antelope which represents a concrete Animal in the creature creation
 * game. This class extends the Animal abstract class, and has a
 * MovementStrategy of the subclass FlightMoveStrategy, as well as the ability
 * to eat and move.
 *
 * @see FlightMoveStrategy
 *
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Antelope extends Animal {

    @Override
    protected void burnCalories() {
        this.Energy = this.Energy - 8;
    }

}
