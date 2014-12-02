package cs407final.creatures;

import cs407final.environment.Position;

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

    protected MovementStrategy moveStrat;
    protected Body body;
    public AnimalComposite composite;
    protected int Energy = 100;
    protected String Name;
    protected boolean Death = false;
    protected Position position;
    protected int Strength;
    protected double Weight;

    public void takeTurn(){
        checkAdjacents();
        move();
        eat();
        burnCalories();
        checkDeath();
    }
    protected abstract void move();
    protected abstract void checkAdjacents();
    protected abstract void eat();
    protected abstract void burnCalories();
    protected void checkDeath() {
        if (Energy < 0)
        {
        System.out.println(Name +" has died");
           Death = true;
        }
    }
    public void getStats(){
        System.out.println("Name: \t\t" +Name);
        System.out.println("Energy: \t" +Energy);
        System.out.println("Weight \t\t" + Weight);
        System.out.println("Strength: \t" +Strength);
        if (Death)
        {
            System.out.println(Name +"is actually Dead!");
        }
        System.out.println("");
    }
    public void setPosition(int x, int y){
        position = new Position(x,y);
    }
   }
