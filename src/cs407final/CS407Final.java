package cs407final;

import cs407final.creatures.Animal;
import cs407final.creatures.InvalidArgumentException;
import cs407final.creatures.AnimalFactory;

public class CS407Final {

    public static void main(String[] args) throws InvalidArgumentException {
        AnimalFactory af = AnimalFactory.getAnimalFactory();
        Animal yogi = af.createAnimal('b');
        Animal gnu = af.createAnimal('a');

        yogi.takeTurn();
        gnu.takeTurn();
        
        System.out.println("Total Weight for Yogi:" +yogi.composite.getWeightTotal());
        System.out.println("Total Weight for Gnu:" +gnu.composite.getWeightTotal());
    }

}
