package cs407final;
//This is a comment. 
public abstract class Animal {

    private MovementStrategy moveStrat;

    public abstract void move();

    public abstract void eat();

    public static void sound() {
        System.out.println("Moo");
    }
}
