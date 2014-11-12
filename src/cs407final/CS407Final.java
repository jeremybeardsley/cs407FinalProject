package cs407final;

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
