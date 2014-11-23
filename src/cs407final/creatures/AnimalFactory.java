package cs407final.creatures;

/**
 * Class Animal Factory which creates animals to populate the creature creation
 * game. Animals are created based on a String parameter, throwing a
 * InvalidArgumentException if the String does not match a known animal.
 *
 * @see InvalidArgumentException
 *
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class AnimalFactory {

    protected static AnimalFactory animalFactory = null;


    private AnimalFactory() {
        //does nothing
    }

    public Animal createAnimal(char animalType) throws InvalidArgumentException {
        if (animalType == 'a') {
            return makeAntelope();
        } else if (animalType == 'b') {
            return makeBear();
        } else {
            throw new InvalidArgumentException("Animal Type Required");
        }
    }

    Bear makeBear() {
        Bear bear = new Bear();
        bear.moveStrat = new RandomMoveStrategy();
        bear.body = new Body();
        bear.body.add(new Torso());
        bear.body.add(new Head());
        bear.body.add(new Legs());
        bear.body.add(new Arms());
        bear.composite = bear.body;

        return bear;
    }

    Antelope makeAntelope() {
        Antelope antelope = new Antelope();
        antelope.moveStrat = new FlightMoveStrategy();
        antelope.body = new Body();
        antelope.body.add(new WeightDecorator(.6, new Torso()));
        antelope.body.add(new WeightDecorator(.6, new Head()));
        antelope.body.add(new WeightDecorator(.6, new Legs()));
        antelope.body.add(new WeightDecorator(.6, new Legs()));
        antelope.composite = antelope.body;
        return antelope;
    }

    public synchronized static AnimalFactory getAnimalFactory() {
        if (animalFactory == null) {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
}
