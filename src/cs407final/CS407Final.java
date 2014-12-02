package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.InvalidArgumentException;
import cs407final.creatures.AnimalFactory;

public class CS407Final {

    public static void main(String[] args) throws InvalidArgumentException {
        AnimalFactory af = AnimalFactory.getAnimalFactory();
        Animal yogi = af.createAnimal('b');
        Animal gnu = af.createAnimal('a');
        Animal t = af.createAnimal('t');

        //yogi.takeTurn();
        //gnu.takeTurn();
        //t.takeTurn();
        yogi.getStats();
        gnu.getStats();
        t.getStats();
    }

}
