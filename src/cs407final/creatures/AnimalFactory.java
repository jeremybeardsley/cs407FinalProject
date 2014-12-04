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

    /**
     *Creates new animal based on the passed argument. 
     * @param animalType
     * @return Animal
     * @throws InvalidArgumentException
     */
    public Animal createAnimal(char animalType) throws InvalidArgumentException {
        if (animalType == 'a') {
            return makeAntelope();
        } else if (animalType == 'b') {
            return makeBear();
        }else if (animalType == 't'){
            return makeTyrranosaurus();
        }else if (animalType == 'y'){
            return makeYeti();
        }else if (animalType == 'h'){
            return makeHoneyBadger();
        }else if (animalType == 'r'){
            return makeBunny();
        } 
        else {
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
        bear.Weight = bear.composite.getWeightTotal();
        bear.Name = "NPC Bear";
        bear.Strength = 10;

        return bear;
    }
    Bunny makeBunny() {
        Bunny peter = new Bunny();
        peter.moveStrat = new RandomMoveStrategy();
        peter.body = new Body();
        peter.body.add(new WeightDecorator(.3, new Torso()));
        peter.body.add(new WeightDecorator(.3, new Head()));
        peter.body.add(new WeightDecorator(.3, new Legs()));
        peter.body.add(new WeightDecorator(.3, new Legs()));
        peter.composite = peter.body;
        peter.Weight = peter.composite.getWeightTotal();
        peter.Name = "NPC Bunny";
        peter.Strength = 2;

        return peter;
    }
        HoneyBadger makeHoneyBadger() {
        HoneyBadger dgaf = new HoneyBadger();
        dgaf.moveStrat = new FlightMoveStrategy();
        dgaf.body = new Body();
        dgaf.body.add(new WeightDecorator(.4, new Torso()));
        dgaf.body.add(new WeightDecorator(.4, new Head()));
        dgaf.body.add(new WeightDecorator(.3, new Legs()));
        dgaf.body.add(new WeightDecorator(.3, new Legs()));
        dgaf.composite = dgaf.body;
        dgaf.Weight = dgaf.composite.getWeightTotal();
        dgaf.Name = "NPC Honey Badger";
        dgaf.Strength = 9;

        return dgaf;
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
        antelope.Weight = antelope.composite.getWeightTotal();
        antelope.Strength = 3;
        antelope.Name = "NPC Antelope";
        return antelope;
        
    }
    Tyrannosaurus makeTyrranosaurus(){
        Tyrannosaurus trex = new Tyrannosaurus();
        trex.moveStrat = new FightMoveStrategy();
        trex.body = new Body();
        trex.body.add(new WeightDecorator(5, new Torso()));
        trex.body.add(new WeightDecorator(2, new Head()));
        trex.body.add(new WeightDecorator(2, new Arms()));
        trex.body.add(new WeightDecorator(15, new Legs()));
        trex.composite = trex.body;
        trex.Weight = trex.composite.getWeightTotal();
        trex.Strength = 50;
        trex.Name = "NPC Scary Dinosaur";
        return trex;
        
    }
      Yeti makeYeti(){
        Yeti yeti = new Yeti();
        yeti.moveStrat = new RandomMoveStrategy();
        yeti.body = new Body();
        yeti.body.add(new WeightDecorator(2, new Torso()));
        yeti.body.add(new WeightDecorator(2, new Head()));
        yeti.body.add(new WeightDecorator(2, new Arms()));
        yeti.body.add(new WeightDecorator(4, new Legs()));
        yeti.composite = yeti.body;
        yeti.Weight = yeti.composite.getWeightTotal();
        yeti.Strength = 25;
        yeti.Name = "NPC Yeti";
        return yeti;
        
    }

    /**
     * Overloaded method for createAnimal, used for implementation of User Created animals. 
     * @param name
     * @param Arms
     * @param Legs
     * @param Head
     * @param Strength
     * @param MoveStrat
     * @param SizeFactor
     * @return
     */
    public Animal createAnimal(String name, int Arms, int Legs, int Head, int Strength, int MoveStrat, double SizeFactor )
      {
          UserCreatedAnimal uca = new UserCreatedAnimal();
          switch(MoveStrat){
              case 0: uca.moveStrat = new FlightMoveStrategy();
                  break;
              case 1: uca.moveStrat = new FightMoveStrategy();
                  break;
              case 2: uca.moveStrat = new RandomMoveStrategy();    
                  break;
              default : uca.moveStrat = new RandomMoveStrategy();  
          }         
          uca.body = new Body();
          for (int i=0; i<=Arms; i++)
          {
              uca.body.add(new WeightDecorator(SizeFactor, new Arms()));
          }
           for (int i=0; i<=Legs; i++)
          {
              uca.body.add(new WeightDecorator(SizeFactor, new Legs()));
          }
           for (int i=0; i<=Head; i++)
          {
              uca.body.add(new WeightDecorator(SizeFactor, new Head()));
          }
           uca.body.add(new WeightDecorator(SizeFactor, new Torso()));
           uca.composite = uca.body;
           uca.Name = "PC " +name;
           uca.Weight = uca.composite.getWeightTotal();
           uca.Strength = Strength;
          return uca;
      }

    /**
     *
     * @return
     */
    public synchronized static AnimalFactory getAnimalFactory() {
        if (animalFactory == null) {
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
}
