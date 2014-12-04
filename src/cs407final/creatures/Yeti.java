/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs407final.creatures;
/**
 * Class Yeti, a lovely creature of myth and fairy tales.  He just wants to hug 
 * you and squeeze you and love you all over.  And gorge you with his horns.
 * 
 * Also, it represents a concrete Animal in the creature creation game.
 * This class extends the Animal abstract class, and has a MovementStrategy of the 
 * subclass FightMoveStrategy, as well as the ability to eat and move.
 * @see FightMoveStrategy
 * 
 * @author Jeremy Beardsley, Andrew McCoy, Matt LeClerc, Andrew Possardt
 * @version 1.0
 * @since 11-4-2014
 */
public class Yeti extends Animal{


    @Override
    protected void burnCalories() {
        this.Energy = this.Energy - 11;
    }
    
}
