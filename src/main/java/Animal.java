package cs407final;
/**
 * Abstract class Animal which represents an animal in the creature creation game. Subclasses
 * of Animal can move, eat, and make a sound. Subclasses also have a MovementStrategy 
 * moveStrat which defines how this Animal moves in the move() method.
 * @see MovementStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public abstract class Animal {

    private MovementStrategy moveStrat;

    public abstract void move();

    public abstract void eat();

    public static void sound() {
        System.out.println("Moo");
    }
}
