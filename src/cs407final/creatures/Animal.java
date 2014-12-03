package cs407final.creatures;

import cs407final.Board;
import cs407final.Creatures;
import cs407final.environment.Position;
import cs407final.tiles.Tile;
import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract class Animal which represents an animal in the creature creation
 * game. Subclasses of Animal can move, eat, and make a sound. Subclasses also
 * have a MovementStrategy moveStrat which defines how this Animal moves in the
 * move() method.
 *
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
    protected ArrayList<Position> adjacents;
    protected boolean sharedTile = false;

    public void takeTurn(Creatures creatures, Board gb) {
        checkAdjacents(creatures);
        move();
        fight(creatures);
        eat(gb);
        checkDeath();
    }

    protected void move() {
        if (this.moveStrat.move()) {
            if (this.adjacents != null) {
                Random rn = new Random();
                int seed = rn.nextInt(100000) % adjacents.size();
                this.position = adjacents.get(seed);
                sharedTile = true;

            } else {
                boolean unOccupied = true;
                Random rn = new Random();
                Position temp;
                do {
                    int x = rn.nextInt(1000000) % 3;
                    int y = rn.nextInt(1000000) % 3;
                    temp = new Position(this.position.xCord + (x - 1), this.position.yCord + (y - 1));
                    if (adjacents.contains(temp)) {
                        unOccupied = false;
                    }
                } while (!unOccupied);
                this.position = temp;
            }
        }
    }

    protected abstract void burnCalories();

    protected void checkDeath() {
        if (Energy < 0) {
            System.out.println(Name + " has died");
            Death = true;
        }
    }

    public void getStats() {
        System.out.println("Name: \t\t" + Name);
        System.out.println("Energy: \t" + Energy);
        System.out.println("Weight \t\t" + Weight);
        System.out.println("Strength: \t" + Strength);
        if (Death) {
            System.out.println(Name + "is actually Dead!");
        }
        System.out.println("");
    }

    public void setPosition(int x, int y) {
        position = new Position(x, y);
    }

    protected void checkAdjacents(Creatures creatures) {
        ArrayList<Position> adjTiles = new ArrayList();
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; i++) {
                adjTiles.add(new Position(this.position.xCord + i, this.position.yCord + j));
            }
        }

        for (Animal c : creatures.CreaturesArray) {
            if (adjTiles.contains(c.position)) {
                adjacents.add(c.position);
            }
        }
    }

    protected void fight(Creatures creatures) {
        if (sharedTile) {
            for (Animal a : creatures.CreaturesArray) {
                if (a.position == this.position) {
                    if (a.Strength >= this.Strength) {
                        this.Energy = 0;
                        System.out.println(a.Name + " has killed " + this.Name);
                    } else {
                        a.Energy = 0;
                        System.out.println(this.Name + " has killed " + a.Name);
                    }
                }
            }
        }
    }

    protected void eat(Board gb) {
        Tile currentTile = gb.gameBoard[this.position.xCord][this.position.yCord];
        if (currentTile.getFood() && this.Energy <= 80) {
            this.Energy += 20;
        } else if (currentTile.getFood()) {
            this.Energy = 100;
        } else {
            burnCalories();
        }
    }
}
