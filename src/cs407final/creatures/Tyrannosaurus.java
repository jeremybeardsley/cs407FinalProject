package cs407final.creatures;

/**
 * Class Tyrannosaurus, long since believed extinct, but recently revived by the
 * imagination of a developer know for his love of beer, and other mind altering 
 * legal liquid substances. 
 * Also, it represents a concrete Animal in the creature creation game.
 * This class extends the Animal abstract class, and has a MovementStrategy of the 
 * subclass FightMoveStrategy, as well as the ability to eat and move.
 * @see FightMoveStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Tyrannosaurus extends Animal{

    @Override
    protected void burnCalories() {
        this.Energy = this.Energy - 18;
    }
    
}
