package cs407final;

/**
 * Class Animal Factory which creates animals to populate the creature creation game.
 * Animals are created based on a String parameter, throwing a InvalidArgumentException
 * if the String does not match a known animal.
 * @see InvalidArgumentException
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class AnimalFactory {
   
    protected static AnimalFactory animalFactory=null;
    private Animal animal;

    AnimalFactory() {
    //does nothing
    }
 
    public static Animal createAnimal (char animalType) throws InvalidArgumentException {
      if (animalType == 'a')
              return new Antelope();
      else if (animalType == 'b')    
              return new Bear();
      else
              throw new InvalidArgumentException("Animal Type Required");
    }

    public synchronized static AnimalFactory getAnimalFactory() {
    if (animalFactory == null){
            animalFactory = new AnimalFactory();
        }
        return animalFactory;
    }
 public Animal getAnimal(){
    return this.animal;
    }
    }
