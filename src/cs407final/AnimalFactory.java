package cs407final;


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
